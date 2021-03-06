package challenges.lists

import scala.annotation.tailrec

object P04 {

    def lengthUsingBuiltInLength[X](l: List[X]): Int = l length

    def lengthUsingBuiltInSize[X](l: List[X]): Int = l size

    def lengthUsingFoldLeft[X](l: List[X]): Int = l.foldLeft(0)((acc, _) => acc + 1)
    
    def lengthUsingFoldLeft2[X](l: List[X]): Int = (0 /: l)((z, _) => z + 1)

    def lengthUsingFoldRight[X](l: List[X]): Int = l.foldRight(0)((_, acc) => acc + 1)
    
    def lengthUsingFoldRight2[X](l: List[X]): Int = (l :\ 0)((_, z) => z + 1)

    def lengthUsingPatternMatching[X](l: List[X]): Int = {
        @tailrec
        def length(acc: Int, l: List[X]): Int = l match {
            case _ :: xs => length(acc + 1, xs)
            case Nil => acc
        }

        length(0, l)
    }

    def lengthUsingPatternMatchingAgain[X](l: List[X]): Int = l match {
        case Nil => 0
        case _ :: xs => 1 + lengthUsingPatternMatchingAgain(xs)
    }

    def lengthUsingBuildInIndexOf[X](l: List[X]): Int = l.indexOf(l.last) + 1
}
