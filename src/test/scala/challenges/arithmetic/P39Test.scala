package challenges.arithmetic

import org.scalatest.{FlatSpec, Matchers}

class P39Test extends FlatSpec with Matchers {

  "listPrimesInRange" should "list all of the prime numbers between 7 and 31 inclusive" in {
    val expected = List(7, 11, 13, 17, 19, 23, 29, 31)
    P39.listPrimesInRange(7 to 31) should contain theSameElementsInOrderAs expected
  }

}
