package challenges.logicandcodes

import challenges.logicandcodes.P46._
import org.scalatest.{Matchers, WordSpec}

class P46Test extends WordSpec with Matchers {

    "and" should {

        "result true" in {
            and(true, true) shouldEqual true
        }

        "result false" in {
            and(false, true) shouldEqual false
            and(false, false) shouldEqual false
            and(false, false) shouldEqual false
        }
    }

    "not" should {

        "result true" in {
            P46.not(false)
        }

        "result false" in {
            P46.not(true)
        }
    }

    "or" should {

        "result true" in {
            or(true, false) shouldEqual true
            or(false, true) shouldEqual true
            or(true, true) shouldEqual true
        }

        "result false" in {
            or(false, false) shouldEqual false
        }
    }

    "nand" should {

        "result true" in {
            nand(true, true) shouldEqual false
        }

        "result false" in {
            nand(false, true) shouldEqual true
            nand(false, false) shouldEqual true
            nand(false, false) shouldEqual true
        }
    }

    "nor" should {

        "result true" in {
            nor(true, false) shouldEqual false
            nor(false, true) shouldEqual false
            nor(true, true) shouldEqual false
        }

        "result false" in {
            nor(false, false) shouldEqual true
        }
    }

    "equ" should {

        "result true" in {
            equ(true, true) shouldEqual true
            equ(false, false) shouldEqual true
        }

        "result false" in {
            equ(false, true) shouldEqual false
            equ(true, false) shouldEqual false
        }
    }

    "xor" should {

        "result true" in {
            xor(false, true) shouldEqual true
            xor(true, false) shouldEqual true
        }

        "result false" in {
            xor(true, true) shouldEqual false
            xor(false, false) shouldEqual false
        }
    }

    "impl" should {

        "result true" in {
            impl(false, false) shouldEqual true
            impl(false, true) shouldEqual true
            impl(true, true) shouldEqual true
        }

        "result false" in {
            impl(true, false) shouldEqual false
        }
    }
}
