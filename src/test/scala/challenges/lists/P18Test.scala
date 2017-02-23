package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P18Test extends FlatSpec with Matchers {

    val l = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k")
    val expected = List("d", "e", "f", "g", "h")
    val i = 3
    val k = 8

    "slice" should "take a slice within the given indices of a list" in {
        P18.slice(i, k, l) should contain theSameElementsInOrderAs expected
        P18.slice_(i, k, l) should contain theSameElementsInOrderAs expected
        P18._slice(i, k, l) should contain theSameElementsInOrderAs expected
    }

}
