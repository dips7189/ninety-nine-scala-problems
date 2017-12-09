package challenges.lists

import scala.annotation.tailrec

object P01 {

    def lastUsingFoldLeft[X](l: List[X]): X = l.foldLeft(l head)((_, x) => x)
    
    def lastUsingFoldLeft2[X](l: List[X]): X = (l.head /: l)((_, x) => x)

    def lastUsingBuiltIn[X](l: List[X]): X = l last

    def lastUsingAnotherBuiltIn[X](l: List[X]): X = l.reverse.head

    @tailrec
    def lastUsingPatternMatching[X](l: List[X]): Option[X] = l match {
        case x :: Nil => Some(x)
        case _ :: xs => lastUsingPatternMatching(xs)
        case _ => None
    }
}
