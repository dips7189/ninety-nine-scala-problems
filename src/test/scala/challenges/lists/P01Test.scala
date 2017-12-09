package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P01Test extends FlatSpec with Matchers {

    val l = List(23, 432, 1, 723, 598)
    val emptyList = List()

    "Last using pattern matching" should "return 598" in {
        val last = P01.lastUsingPatternMatching(l)
        last shouldBe Some(598)
    }

    "Last using another built-in" should "return 598" in {
        val last = P01.lastUsingAnotherBuiltIn(l)
        last should be (598)
    }

    "Last using fold left" should "return 598" in {
        val last = P01.lastUsingFoldLeft(l)
        val last2 = P01.lastUsingFoldLeft2(l)
        
        last should be (598)
        last2 should be (598)
    }

    "Last using pattern matching, another built-in and using fold left" should "throw no such element exception" in {
        an [NoSuchElementException] should be thrownBy P01.lastUsingAnotherBuiltIn(emptyList)
        an [NoSuchElementException] should be thrownBy P01.lastUsingFoldLeft(emptyList)
    }

    "Last using patter matching" should "return None" in {
        P01.lastUsingPatternMatching(emptyList) shouldBe None
    }

}
