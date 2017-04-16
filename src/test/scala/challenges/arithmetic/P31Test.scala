package challenges.arithmetic

import org.scalatest.{FlatSpec, Matchers}

class P31Test extends FlatSpec with Matchers {

    val numbers = List(7, 13, 2, 9587, 222, 10903, 102701, 104701, 70, 179424691, 179425817, 179425993, 433024253, 533000389,
        654188383, 817504243)
    val expected = List(true, true, true, true, false, true, true, true, false, true, true, true, true, true, true, true)

    "is Prime" should "determine whether numbers are prime" in {
        val resultFromFirst = numbers.foldLeft(List[Boolean]())((acc, i) => P31.isPrime(i) :: acc).reverse
        val resultFromSecond = numbers.foldLeft(List[Boolean]())((acc, i) => P31.isPrime_(i) :: acc).reverse
        val resultFromFermatsLittleTheorem = numbers.foldLeft(List[Boolean]())((acc, i) => P31.isPrime_usingFermatsLittleTheorem(i) :: acc).reverse

        resultFromFirst should contain theSameElementsInOrderAs expected
        resultFromSecond should contain theSameElementsInOrderAs expected
    }

}
