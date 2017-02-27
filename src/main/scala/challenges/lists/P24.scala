package challenges.lists

import scala.util.Random

object P24 {

    def lotto(i: Int, j: Int): List[Int] = Random.shuffle(List.range(i, j + 1)).take(i)

    def _lotto(i: Int, j: Int): List[Int] = P23._randomSelect(i, List.range(1, j + 1))

}
