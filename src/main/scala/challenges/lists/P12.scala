package challenges.lists

import scala.annotation.tailrec

object P12 {

    def decode[X](l: List[(Int, X)]): List[X] = {
        @tailrec
        def _decode[X](l: List[(Int, X)], r: List[X]): List[X] = l match {
            case (x: Int, y: X) :: xs => _decode(xs, r ++ List.fill(x)(y))
            case (x: X) :: xs => _decode(xs, r :+ x)
            case Nil => r
        }

        _decode(l, List[X]())
    }

    def decode_[X](l: List[(Int, X)]): List[X] = l flatMap (x => List.fill(x._1)(x._2))

}
