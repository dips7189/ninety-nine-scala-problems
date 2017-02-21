package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P11Test extends FlatSpec with Matchers {

    val l = List(1,2,2,2,3,3,4,5,6,6,6,7,7,8,9)
    val expected = List(1, (3, 2), (2, 3), 4, 5, (3, 6), (2, 7), 8, 9)

    "encode modified" should "do run length encoding of the list l" in {
        P11.encodeModifiedUsingMap(l) should contain theSameElementsInOrderAs expected
        P11.encodeModified(l) should contain theSameElementsInOrderAs expected
    }

}
