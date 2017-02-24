package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P19Test extends FlatSpec with Matchers {

    val l = List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")
    val expectedPositiveRotated = List("d", "e", "f", "g", "h", "i", "j", "k", "a", "b", "c")
    val expectedNegativeRotated = List("j", "k", "a", "b", "c", "d", "e", "f", "g", "h", "i")
    val positiveR = 3
    val negativeR = -2
    val neutralR = 0

    "rotate" should "rotate the list given a positive rotation" in {
        P19.rotate(positiveR, l) should contain theSameElementsInOrderAs expectedPositiveRotated
    }

    "rotate" should "rotate the list given a negative rotation" in {
        P19.rotate(negativeR, l) should contain theSameElementsInOrderAs expectedNegativeRotated
    }

    "rotate" should "not rotate the list given a neutral rotation" in {
        P19.rotate(neutralR, l) should contain theSameElementsInOrderAs l
    }
}
