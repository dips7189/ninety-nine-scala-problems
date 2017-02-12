package challenges

import org.scalatest.{FlatSpec, Matchers}

class P04Test extends FlatSpec with Matchers {

    val l = List("Sirius", "Arcturus", "Altair", "Rigel", "Betelgeuse", "Polaris", "Gamma Leonis", "Danebola", "Alsafi", "Beta Andromadae")
    val emptyList = List()

    "length using foldLeft, foldRight, pattern matching, pattern matching again & indexOf" should "return 10" in {
        P04.lengthUsingFoldLeft(l) shouldBe 10
        P04.lengthUsingFoldRight(l) shouldBe 10
        P04.lengthUsingPatternMatching(l) shouldBe 10
        P04.lengthUsingPatternMatchingAgain(l) shouldBe 10
        P04.lengthUsingBuildInIndexOf(l) shouldBe 10
    }

    "length using foldLeft, foldRight, pattern matching, pattern matching again & indexOf" should "return 0" in {
        P04.lengthUsingFoldLeft(emptyList) shouldBe 0
        P04.lengthUsingFoldRight(emptyList) shouldBe 0
        P04.lengthUsingPatternMatching(emptyList) shouldBe 0
        P04.lengthUsingPatternMatchingAgain(emptyList) shouldBe 0
    }

    "Length using built-in indexOf with last" should "throw no such element exception" in {
        an [NoSuchElementException] should be thrownBy P04.lengthUsingBuildInIndexOf(emptyList)
    }
}
