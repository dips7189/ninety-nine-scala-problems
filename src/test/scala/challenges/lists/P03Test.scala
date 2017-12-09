package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P03Test extends FlatSpec with Matchers {

    val l = List("Duo Maxwell", "Heero Yuy", "Quatre Raberba Winner", "Troa Barton", "Wufei Chang")
    val emptyList = List()

    "nth using built-in lift" should "return Heero Yuy" in {
        val second = P03.nthUsingBuiltInLift(1, l)
        second should be ("Heero Yuy")
    }

    "nth using built-in drop" should "return Duo Maxwell" in {
        val first = P03.nthUsingBuiltInDrop(0, l)
        first should be ("Duo Maxwell")
    }

    "nth using pattern matching" should "return Quatre Raberba Winner" in {
        val third = P03.nthUsingPatternMatching(2, l)
        third shouldBe Some("Quatre Raberba Winner")
    }

    "nth using pattern matching again" should "return Trao Barton" in {
        val fourth = P03.nthUsingPatternMatchingAgain(3, l)
        fourth shouldBe Some("Troa Barton")
    }

    "nth using built-in lift, built-in drop, and both pattern matching" should "throw no such element exception" in {
        an [NoSuchElementException] should be thrownBy P03.nthUsingBuiltInLift(0, emptyList)
        an [NoSuchElementException] should be thrownBy P03.nthUsingBuiltInDrop(3, emptyList)
    }

    "nth using pattern matching" should "return None" in {
        P03.nthUsingPatternMatching(1, emptyList) shouldBe None
        P03.nthUsingPatternMatchingAgain(2, emptyList) shouldBe None
    }
}
