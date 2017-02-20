package challenges.lists

object P08 {

    def compressUsingBuiltIn[X](l: List[X]): List[X] = l distinct

    def compressUsingFoldRight[X](l: List[X]): List[X] = l.foldRight(List[X]())((x, acc) => {
        if(acc.isEmpty || x != acc.head) x :: acc
        else acc
    })

    def compressUsingPatternMatching[X](l: List[X]): List[X] = l match {
        case Nil => Nil
        case x :: xs => x :: compressUsingPatternMatching(xs dropWhile (y => y == x))
    }

    def compressUsingPatternMatchingAgain[X](l: List[X]): List[X] = l match {
        case Nil => Nil
        case x :: xs => x :: compressUsingPatternMatchingAgain(xs filterNot (y => y == x))
    }
}
