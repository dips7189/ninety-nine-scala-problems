package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P22Test extends FlatSpec with Matchers {

    val i = 4
    val j = 9
    val expected = List(4,5,6,7,8,9)

    "range" should "yield a list containing all integers between 4 & 9" in {
        P22.range(4, 9) should contain theSameElementsInOrderAs expected
        P22._range(4, 9) should contain theSameElementsInOrderAs expected
        P22.range_(4, 9) should contain theSameElementsInOrderAs expected
    }

}
