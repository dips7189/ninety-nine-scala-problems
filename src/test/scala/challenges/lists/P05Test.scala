package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P05Test extends FlatSpec with Matchers {

    val l = List("Dorabella", "Beale Papers", "McKormick's Notes", "Voynich Manuscript", "D’Agapeyeff", "D-Day Pigeon")
    val expectedList = List("D-Day Pigeon", "D’Agapeyeff", "Voynich Manuscript", "McKormick's Notes", "Beale Papers", "Dorabella")
    val emptyList = List()

    "reverse using foldleft, pattern matching and second pattern mathing attempt" should "return expectedList" in {
        P05.reverseUsingUsingFoldLeft(l) should contain theSameElementsInOrderAs expectedList
        P05.reverseUsingUsingFoldLeft2(l) should contain theSameElementsInOrderAs expectedList
        P05.reverseUsingUsingFoldRight(l) should contain theSameElementsInOrderAs expectedList
        P05.reverseUsingUsingFoldRight2(l) should contain theSameElementsInOrderAs expectedList
        P05.reverseUsingPatternMatching(l) should contain theSameElementsInOrderAs expectedList
        P05.reverseUsingPatternMatchingAgain(l) should contain theSameElementsInOrderAs expectedList
    }

}
