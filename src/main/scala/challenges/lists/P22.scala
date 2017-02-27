package challenges.lists

import scala.annotation.tailrec

object P22 {

    def range(i: Int, j: Int): List[Int] = List.range(i, j + 1)

    def _range(i: Int, j: Int): List[Int] = i to j toList

    def range_(i: Int, j: Int): List[Int] = {
        @tailrec
        def rangeInt(j: Int, r: List[Int]): List[Int] = {
            if(j < i) r
            else (rangeInt(j - 1, j :: r))
        }

        rangeInt(j, List())
    }
}
