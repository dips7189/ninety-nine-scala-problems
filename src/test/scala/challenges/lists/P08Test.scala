package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P08Test extends FlatSpec with Matchers {

    val l = List(1, 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9, 9, 9, 9)
    val expected = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    "compress using foldright, pattern matching and pattern matching again" should "return expected" in {
        P08.compressUsingFoldRight(l) should contain theSameElementsInOrderAs expected
        P08.compressUsingPatternMatching(l) should contain theSameElementsInOrderAs expected
        P08.compressUsingPatternMatchingAgain(l) should contain theSameElementsInOrderAs expected
    }

}
