package challenges.lists

import scala.annotation.tailrec

object P17 {

    def split[X](n: Int, l: List[X]): (List[X], List[X]) = (l take(n), l drop(n))

    def split_[X](n: Int, l: List[X]): (List[X], List[X]) = (l take(n), l takeRight(l.length - n))

    def _split[X](n: Int, l: List[X]): (List[X], List[X]) = l.splitAt(n)

    def _split_[X](n: Int, l: List[X]): (List[X], List[X]) = {
        @tailrec
        def split_[X](z: Int, l: List[X], r: List[X]): (List[X], List[X]) = (z, l) match {
            case (0, ls) => (r reverse, ls)
            case (z, x :: xs) => split_(z - 1, xs, x :: r)
            case (_, Nil) => (r reverse, Nil)
        }

        split_(n, l, List())
    }

}
