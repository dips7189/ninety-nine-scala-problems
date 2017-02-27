package challenges.lists

import scala.util.Random

object P23 {

    def randomSelect[X](n: Int, l: List[X]): List[X] = Random.shuffle(l).take(n)

    def _randomSelect[X](n: Int, l: List[X]): List[X] = {
        def select(r: Random, n: Int, l2: List[X]): List[X] = {
            if(n <= 0) Nil
            else {
                val (rest, x) = P20.removeAt(r.nextInt(l length), l)
                x :: select(r, n - 1, rest)
            }
        }

        select(Random, n, l)
    }

}
