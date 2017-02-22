package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P14Test extends FlatSpec with Matchers {

    val l = List("Benitoite", "Grandidierite", "Black Opal", "Red Beryl", "Jadeite", "Alexandrite")
    val expected = List("Benitoite", "Benitoite", "Grandidierite", "Grandidierite", "Black Opal",
        "Black Opal", "Red Beryl", "Red Beryl", "Jadeite", "Jadeite", "Alexandrite", "Alexandrite")

    "duplicate" should "duplicate all of the elements" in {
        P14.duplicate(l) should contain theSameElementsInOrderAs expected
        P14.duplicate_(l) should contain theSameElementsInOrderAs expected
        P14._duplicate(l) should contain theSameElementsInOrderAs expected
    }

}
