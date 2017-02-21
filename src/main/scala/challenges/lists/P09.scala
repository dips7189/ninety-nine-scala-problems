package challenges.lists

import scala.annotation.tailrec

object P09 {

    def pack[X](l: List[X]): List[List[X]] = {
        @tailrec
        def _pack(l: List[X], r: List[List[X]]): List[List[X]] = l match {
            case x :: xs => _pack(xs.dropWhile(y => y == x), r :+ (x +: xs.takeWhile(y => y == x)))
            case Nil => r
        }

        _pack(l, List())
    }
}
