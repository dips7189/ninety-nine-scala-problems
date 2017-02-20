package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P07Test extends FlatSpec with Matchers {

    val l = List(List(1, 2, 3), List(543, 7, 8, 9), List(1, 1), List(3, 3), List(496, 546, 1235))
    val expected = List(1, 2, 3, 543, 7, 8, 9, 1, 1, 3, 3, 496, 546, 1235)

    "flatten and flatten using flatmap" should "return expected" in {
        P07.flatten(l) should contain theSameElementsInOrderAs expected
        P07.flattenUsingFlatMap(l) should contain theSameElementsInOrderAs expected
    }

}
