package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P16Test extends FlatSpec with Matchers {

    val l = List("Agartha", "Shambhala", "Yomi", "Thuvaraiyam Pathi", "Nibiru", "El Dorado", "Baltia", "Atlantis")
    val expected = List("Agartha", "Shambhala", "Thuvaraiyam Pathi", "Nibiru", "Baltia", "Atlantis")

    "drop" should "remove every third item in the list" in {
        P16.drop(3, l) should contain theSameElementsInOrderAs expected
    }

}
