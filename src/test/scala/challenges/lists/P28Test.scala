package challenges.lists

import org.scalatest.{FlatSpec, Matchers}

class P28Test extends FlatSpec with Matchers {
    
    val ls = List(List("a", "b", "c"), List("d", "e"), List("f", "g", "h"), List("d", "e"), List("i", "j", "k", "l"), 
        List("m", "n"), List("o"))
    
    val expected = List(List("o"), List("d", "e"), List("d", "e"), List("m", "n"), List("a", "b", "c"),
        List("f", "g", "h"), List("i", "j", "k", "l"))

    val expected2 = List(List("i", "j", "k", "l"), List("o"), List("a", "b", "c"), List("f", "g", "h"), List("d", "e"), List("d", "e"), List("m", "n"))
    
    "lsort" should "sort the sublists by length" in {
        P28.lsort(ls) should contain theSameElementsInOrderAs expected
        P28._lsort(ls) should contain theSameElementsInOrderAs expected
    }
    
    "lsortFreq" should "should sort the sublists by frequency" in {
        P28.lsortFreq(ls) should contain theSameElementsInOrderAs expected2
        P28._lsortFreq(ls)
    }

}
