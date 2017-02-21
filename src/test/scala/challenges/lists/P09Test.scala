package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P09Test extends FlatSpec with Matchers {

    val l = List(1,2,2,2,3,3,4,5,6,6,6,7,7,8,9)
    val expected = List(List(1), List(2, 2, 2), List(3, 3), List(4), List(5), List(6, 6, 6), List(7, 7), List(8), List(9))

    "pack" should "return the expected list" in {
        P09.pack(l) should contain theSameElementsInOrderAs expected
    }
}
