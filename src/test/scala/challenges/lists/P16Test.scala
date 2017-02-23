package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P16Test extends FlatSpec with Matchers {

    val l = List("Agartha", "Shambhala", "Yomi", "Thuvaraiyam Pathi", "Nibiru", "El Dorado", "Baltia", "Atlantis")
    val l2 = List(1, 2, 3)
    val expected = List("Agartha", "Shambhala", "Thuvaraiyam Pathi", "Nibiru", "Baltia", "Atlantis")

    "drop" should "remove every third item in the list" in {
        P16.drop(3, l) should contain theSameElementsInOrderAs expected
    }

    "drop" should "not drop any elements in a list with length shorter than n" in {
        P16.drop(4, l2) should contain theSameElementsInOrderAs l2
    }

    "drop" should "not drop any elements in a list when n is 0" in {
        P16.drop(0, l) should contain theSameElementsInOrderAs l
    }

}
