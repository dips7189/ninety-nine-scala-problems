package challenges

import org.scalatest.{FlatSpec, Matchers}

class P02Test extends FlatSpec with Matchers {

    val l = List("abiru aisaburō", "noguchi kenji", "serizawa kamo", "saitō hajime", "hirayama gorō")
    val emptyList = List()

    "Penultimate using another built-in" should "return saitō hajime" in {
        val penultimate = P02.penultimateUsingFoldLeft(l)
        penultimate should be ("saitō hajime")
    }

    "Penultimate using fold left" should "return saitō hajime" in {
        val penultimate = P02.penultimateUsingPatternMatching(l)
        penultimate should be ("saitō hajime")
    }

    "Penultimate using pattern matching" should "return saitō hajime" in {
        val penultimate = P02.penultimateUsingBuiltIn(l)
        penultimate should be ("saitō hajime")
    }

    "Penultimate using pattern matching, another built-in and using fold left" should "throw no such element exception" in {
        an [NoSuchElementException] should be thrownBy P02.penultimateUsingFoldLeft(emptyList)
        an [NoSuchElementException] should be thrownBy P02.penultimateUsingPatternMatching(emptyList)
        an [NoSuchElementException] should be thrownBy P02.penultimateUsingBuiltIn(emptyList)
    }
}
