package challenges.arithmetic

import org.scalatest.{FlatSpec, Matchers}

class P37Test extends FlatSpec with Matchers {

    "totient" should "find all of the coprimes up to 10000" in {
        P37.totient(10000) shouldEqual 4000
    }

}
