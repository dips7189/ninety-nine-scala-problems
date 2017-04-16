package challenges.arithmetic

import org.scalatest.{FlatSpec, Matchers}

class P38Test extends FlatSpec with Matchers {

    "phi of 10090" should "be 4032" in {
        P37.totient(10090) shouldEqual 4032
        P34.totient(10090) shouldEqual 4032
    }

}
