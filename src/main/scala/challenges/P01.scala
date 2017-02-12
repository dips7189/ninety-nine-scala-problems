package challenges

object P01 {

    def lastUsingFoldLeft[X](l: List[X]): X = l.foldLeft(l head)((_, x) => x)

    def lastUsingBuiltIn[X](l: List[X]): X = l last

    def lastUsingAnotherBuiltIn[X](l: List[X]): X = l.reverse.head

    def lastUsingPatternMatching[X](l: List[X]): X = l match {
        case x :: Nil => x
        case _ :: xs => lastUsingPatternMatching(xs)
        case _ => throw new NoSuchElementException
    }
}