package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P20Test extends FlatSpec with Matchers {

    val l = List('a, 'b, 'c, 'd)
    val expected = (List('a, 'c, 'd), 'b)
    val k = 1

    "removeAt" should "remove the element at position/index 1 and reserve it in the resulting tuple" in {
        val  r = P20.removeAt(k, l)
        val  r2 = P20._removeAt(k, l)
        val  r3 = P20.removeAt_(k, l)

        r._1 shouldEqual expected._1
        r._2 shouldEqual expected._2

        r2._1 shouldEqual expected._1
        r2._2 shouldEqual expected._2

        r3._1 shouldEqual expected._1
        r3._2 shouldEqual expected._2
    }

}
