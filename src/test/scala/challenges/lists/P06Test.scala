package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P06Test extends FlatSpec with Matchers {

    val l = List(4, 78, 43, 8, 102, 8, 43, 78, 4)
    val l2 = List(1,2,3,4,5,6)

    "is palindrome using built in, pattern matching & extractor" should "return true" in {
        P06.isPalindromeUsingBuiltIn(l) shouldBe true
        P06.isPalindromeUsingPatternMatching(l) shouldBe true
        P06.isPalindromic(l) shouldBe true
    }

    "is palindrome using built in, pattern matching & extractor" should "return false" in {
        P06.isPalindromeUsingBuiltIn(l2) shouldBe false
        P06.isPalindromeUsingPatternMatching(l2) shouldBe false
        P06.isPalindromic(l2) shouldBe false
    }

}
