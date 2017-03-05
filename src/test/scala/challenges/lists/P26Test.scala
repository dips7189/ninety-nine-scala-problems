package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P26Test extends FlatSpec with Matchers {

    val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12)
    val k = 3
    
    "combinations" should "produce 220 combinations" in {
        P26.combinations(3, l).length should be(220)
    }
    
}
