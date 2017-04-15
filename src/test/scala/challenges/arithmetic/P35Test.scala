package challenges.arithmetic

import org.scalatest.{Matchers, WordSpec}

class P35Test extends WordSpec with Matchers {


  "primeFactors" should {

    "return all the prime factors of 315" in {
      val expected = List(3, 3, 5, 7)
      P35.primeFactors(315) should contain theSameElementsInOrderAs expected
      P35.primeFactors_(315) should contain theSameElementsInOrderAs expected
    }

    "return all the prime factors of 1200" in {
      val expected = List(2, 2, 2, 2, 3, 5, 5)
      P35.primeFactors(1200) should contain theSameElementsInOrderAs expected
      P35.primeFactors_(1200) should contain theSameElementsInOrderAs expected
    }

    "return all the prime factors of 99" in {
      val expected = List(3, 3, 11)
      P35.primeFactors(99) should contain theSameElementsInOrderAs expected
      P35.primeFactors_(99) should contain theSameElementsInOrderAs expected
    }

  }

}
