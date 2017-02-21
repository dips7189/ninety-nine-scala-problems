package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P12Test extends FlatSpec with Matchers {

    val l = List((1, 1), (3, 2), (2, 3), (1, 4), (1, 5), (3, 6), (2, 7), (1, 8), (1, 9))
    val expected = List(1,2,2,2,3,3,4,5,6,6,6,7,7,8,9)

    "decode" should "uncompress the compressed list" in {
        P12.decode(l) should contain theSameElementsInOrderAs expected
        P12.decode_(l) should contain theSameElementsInOrderAs expected
    }
}
