package challenges.arithmetic

import org.scalatest.{Matchers, WordSpec}

class P33Test extends WordSpec with Matchers {

    "isCoprimeTo" should {

        "determine that 6 and 25 are coprime" in {
            P33.isCoprimeTo(6, 25) shouldEqual true
        }

        "determine that 176 and 3420 are not coprime" in {
            P33.isCoprimeTo(176, 3420) shouldEqual false
        }

        "determine that 11 and 14 are coprime" in {
            P33.isCoprimeTo(11, 14) shouldEqual true
        }

        "determine that 27 and 16 are coprime" in {
            P33.isCoprimeTo(27, 16) shouldEqual true
        }

    }

}
