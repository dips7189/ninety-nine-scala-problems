package challenges.logicandcodes

import org.scalatest.{FlatSpec, Matchers}

class P50Test extends FlatSpec with Matchers {

    "huffman" should "provide optimal prefix codes" in {
        val expected = List(("a", "0"), ("b", "101"), ("c", "100"), ("d", "111"), ("e", "1101"), ("f", "1100"))
        val result = P50.huffman(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)))
        result should contain theSameElementsAs expected
    }

}
