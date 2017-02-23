package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P17Test extends FlatSpec with Matchers {

    val l = List("Kusanagi", "Crown Jewels of England", "Llywelyn's coronet", "La Noche Triste treasure", "Treasure of Lima", "Tokugawa's buried treasure", "Patiala Necklace")
    val expected = (List("Kusanagi", "Crown Jewels of England", "Llywelyn's coronet", "La Noche Triste treasure"), List("Treasure of Lima", "Tokugawa's buried treasure", "Patiala Necklace"))

    "split" should "split the list at the fourth position" in {
        P17.split(4, l) shouldBe expected
        P17._split(4, l) shouldBe expected
        P17.split_(4, l) shouldBe expected
        P17._split_(4, l) shouldBe expected
    }

    "split" should "give an empty first list when the split position is 0" in {
        P17.split(0, l) should be (List(), l)
        P17._split(0, l) should be (List(), l)
        P17.split_(0, l) should be (List(), l)
        P17._split_(0, l) should be (List(), l)
    }

}
