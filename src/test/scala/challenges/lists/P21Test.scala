package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P21Test extends FlatSpec with Matchers {

    val l = List("Matsya", "Kurma", "Varaha", "Narasimha", "Parashurama", "Rama")
    val avatara = "Vamana"
    val i = 3
    val expected = List("Matsya", "Kurma", "Varaha", "Vamana", "Narasimha", "Parashurama", "Rama")

    "insertAt" should "insert the Vamana Avatara in the third position in the list of Avataras" in {
        P21.insertAt(avatara, i, l) should contain theSameElementsInOrderAs expected
        P21._insertAt(avatara, i, l) should contain theSameElementsInOrderAs expected
    }

}
