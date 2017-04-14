package challenges.arithmetic

import org.scalatest.{Matchers, WordSpec}

class P32Test extends WordSpec with Matchers {

  "gcd" should {

    "find the greatest common divisor of 376 and 240 to be 8" in {
      P32.gcd(376, 240) shouldEqual 8
      P32.gcd_(376, 240) shouldEqual 8
    }

    "find the greatest common divisor of 0 and 94 to be 0" in {
      P32.gcd(94, 0) shouldEqual 94
      P32.gcd_(94, 0) shouldEqual 94
    }

    "find the greatest common divisor of 2744 and 10 to be 2" in {
      P32.gcd(2744, 10) shouldEqual 2
      P32.gcd(2744, 10) shouldEqual 2
    }

    "find the greatest common divisor of 176 and 3420 to be 4" in {
      P32.gcd(176, 3420) shouldEqual 4
      P32.gcd_(176, 3420) shouldEqual 4
    }
  }
}
