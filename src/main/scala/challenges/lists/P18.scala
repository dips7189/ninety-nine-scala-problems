package challenges.lists

import scala.annotation.tailrec

object P18 {

    def slice[X](i: Int, k: Int, l: List[X]): List[X] = l slice(i, k)

    def slice_[X](i: Int, k: Int, l: List[X]): List[X] = l take k drop i

    def _slice[X](start: Int, end: Int, ls: List[X]): List[X] = {
        @tailrec
        def sliceR(acc: Int, curList: List[X], result: List[X]): List[X] =
            (acc, curList) match {
                case (_, Nil)                     => result.reverse
                case (c, h :: tail) if end <= c   => result.reverse
                case (c, h :: tail) if start <= c => sliceR(c + 1, tail, h :: result)
                case (c, _ :: tail)               => sliceR(c + 1, tail, result)
            }
        sliceR(0, ls, Nil)
    }

}
