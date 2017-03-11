package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P27Test extends FlatSpec with Matchers {

    import P27.{group, group3}

    val l = List("Ulysse Nardin", "Audemars Piguet", "IWC Schaffhausen", "Jaeger-LeCoultre", "Piaget SA", "Cartier",
        "Breitling", "Omega", "TAG Heuer")

    "group 3" should "group 9 person into 3 groups of size 2,3, and 4" in {
        val g = group3(l)
        g should have length 1260
    }

    "group" should "group 9 person into 3 groups of size 2, 3 and 4" in {
        val g = group(List(2, 3, 4), l)
        g should have length 1260
    }

    "group" should "group 9 person into 3 groups of size 2, 2 and 5" in {
        val g = group(List(2, 2, 5), l)
        g should have length 756
    }

}
