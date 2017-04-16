package challenges.logicandcodes

import org.scalatest.{FlatSpec, Matchers}

class P49Test extends FlatSpec with Matchers {

    "gray" should "return the gray code for 2" in {
        val expected = List("00", "01", "11", "10")
        P49.gray(2) shouldEqual expected
    }

    "gray" should "return the gray  code for 3" in {
        val expected = List("000", "001", "011", "010", "110", "111", "101", "100")
        P49.gray(3) shouldEqual expected
    }

}
