package challenges.arithmetic

import org.scalatest.{Matchers, WordSpec}

class P36Test extends WordSpec with Matchers {

  "primeFactorMultiplicity" should {

    "find the prime factors with their multiplicty for 315" in {
      val expectedMap = Map(3 -> 2, 5 -> 1, 7 -> 1)
      val expectedList = List((3, 2), (5, 1), (7, 1))

      P36.primeFactorMultiplicity(315) shouldEqual expectedMap
      P36.primeFactorMultiplicity_(315) shouldEqual expectedMap
      P36._primeFactorMultiplicity(315) shouldEqual expectedList
    }

    "find the prime factors with their multiplicty for 1200" in {
      val expectedMap = Map(2 -> 4, 3 -> 1, 5 -> 2)
      val expectedList = List((2, 4), (3, 1), (5, 2))

      P36.primeFactorMultiplicity(1200) shouldEqual expectedMap
      P36.primeFactorMultiplicity_(1200) shouldEqual expectedMap
      P36._primeFactorMultiplicity(1200) shouldEqual expectedList
    }

  }

}
