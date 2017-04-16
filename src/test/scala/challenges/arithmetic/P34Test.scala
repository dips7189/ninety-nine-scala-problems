package challenges.arithmetic

import org.scalatest.{FlatSpec, Matchers}

class P34Test extends FlatSpec with Matchers {

    "totient" should "find all of the coprimes up to 10000" in {
        P34.totient(10000) shouldEqual 4000
        P34.totient_(10000) shouldEqual 4000
        P34._totient_(10000) shouldEqual 4000
    }

}
