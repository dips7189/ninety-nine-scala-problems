package challenges

object P02 {

    def penultimateUsingFoldLeft[X](l: List[X]): X = l.foldLeft((l head, l.tail.head)) { (x, y) => (x._2, y) }._1

    def penultimateUsingPatternMatching[X](l: List[X]): X = l match {
        case x :: _ :: Nil => x
        case _ :: xs => penultimateUsingPatternMatching(xs)
        case _ => throw new NoSuchElementException
    }

    def penultimateUsingBuiltIn[X](l: List[X]): X = {
        if (l isEmpty) throw new NoSuchElementException
        else l.init.last
    }
}
