package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P24Test extends FlatSpec with Matchers {

    val i = 6
    val j = 49

    "lotto" should "select 6 random numbers between 1 and 49 inclusive" in {
        P24.lotto(i, j) should have length i
        P24._lotto(i, j) should have length i
    }


}
