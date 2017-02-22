package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P15Test extends FlatSpec with Matchers {

    val l = List(1, 2, 3, 4, 5)
    val expected = List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5)
    val n = 3

    "duplicate n " should "duplicate each value three times" in {
        P15.duplicateN(n, l) should contain theSameElementsInOrderAs expected
        P15.duplicateN_(n, l) should contain theSameElementsInOrderAs expected
        P15._duplicateN(n, l) should contain theSameElementsInOrderAs expected
    }

}
