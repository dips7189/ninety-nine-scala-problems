package challenges.lists

import scala.reflect.ClassTag
import scala.util.Random

object P25 {

    /**
      * An in-place shuffle also known as the inside-out algorithm by Richard Durstenfeld
      * which is an alternative to the Fisher-Yates algorithm
      *
      * @see See https://en.wikipedia.org/wiki/Fisher–Yates_shuffle
      */
    def randomPermute[X: ClassTag](l: List[X]): List[X] = {
        def swap[X](x: Int, y: Int, s: Array[X]): Unit = {
            val temp = s(x)
            s(x) = s(y)
            s(y) = temp
        }

        val a = l.toArray
        for (i <- a.length - 1 to 1 by -1) swap(i, Random.nextInt(i), a)
        a toList
    }

}
