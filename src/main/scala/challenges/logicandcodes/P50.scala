package challenges.logicandcodes

import scala.annotation.tailrec
import scala.collection.immutable.Queue

object P50 {

    private abstract sealed class Tree[X] {
        val freq: Int

        def toCode(prefix: String): List[(X, String)]
    }

    private final case class LeafNode[X](symbol: X, freq: Int) extends Tree[X] {
        override def toCode(prefix: String): List[(X, String)] = List((symbol, prefix))
    }

    private final case class InternalNode[X](freq: Int, left: Tree[X], right: Tree[X]) extends Tree[X] {
        override def toCode(prefix: String): List[(X, String)] = left.toCode(prefix + "0") ::: right.toCode(prefix + "1")
    }

    def huffman[X](l: List[(X, Int)]): List[(X, String)] = {

        def compareDequeue(q1: Queue[Tree[X]], q2: Queue[Tree[X]]): (Tree[X], Queue[Tree[X]], Queue[Tree[X]]) = (q1, q2) match {
            case (x +: xs, Queue()) => (q1.front, q1.dequeue._2, q2)
            case (Queue(), y +: ys) => (q2.front, q1, q2.dequeue._2)
            case (x +: xs, y +: ys) if q2.front.freq < q1.front.freq => (q2.front, q1, q2.dequeue._2)
            case _ => (q1.front, q1.dequeue._2, q2)

        }

        @tailrec
        def _huffman(q1: Queue[Tree[X]], q2: Queue[Tree[X]]): List[(X, String)] = {
            if (q1.size + q2.size == 1) {
                if (q1.isEmpty) q2.front.toCode("")
                else q2.front.toCode("")
            } else {
                val (n1, q3, q4) = compareDequeue(q1, q2)
                val (n2, q5, q6) = compareDequeue(q3, q4)
                _huffman(q5, q6.enqueue(InternalNode(n1.freq + n2.freq, n1, n2)))
            }
        }

        val q1 = Queue.empty.enqueue(l.sortBy(_._2).map { x => LeafNode(x._1, x._2) })
        _huffman(q1, Queue.empty)
    }

}
