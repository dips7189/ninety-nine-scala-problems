package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P25Test extends FlatSpec with Matchers {

    val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    "randomPermute" should "generate a list of shuffled elements" in {
        val permutation = P25.randomPermute(l)
        print(permutation)
        permutation should contain theSameElementsAs l
        permutation should have length 12
    }

}
