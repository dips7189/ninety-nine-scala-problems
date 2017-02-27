package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P23Test extends FlatSpec with Matchers {

    val l = List("Taaffeite", "Black Opal", "Benitoite", "Red Beryl", "Alexandrite", "Jadeite", "Musgravite", "Pink Star Diamond")
    val expectedLength = 4

    "randomSelect" should "randomly select four elements from the list" in {
        P23.randomSelect(4, l) should have length 4
        P23._randomSelect(4, l) should have length 4
    }

}
