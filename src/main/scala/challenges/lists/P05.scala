package challenges.lists

import scala.annotation.tailrec

object P05 {

    def reverseUsingBuiltIn[X](l: List[X]): List[X] = l reverse

    def reverseUsingUsingFoldLeft[X](l: List[X]): List[X] = l.foldLeft(List[X]())((result, h) => h :: result)

    def reverseUsingPatternMatching[X](l: List[X]): List[X] = {
        @tailrec
        def reverse[X](l: List[X], result: List[X]): List[X] = l match {
            case x :: xs => reverse(xs, x::result)
            case Nil => result
        }

        reverse(l, Nil)
    }

    def reverseUsingPatternMatchingAgain[X](l: List[X]): List[X] = l match {
        case Nil => l
        case x :: xs => reverseUsingPatternMatchingAgain(xs) ::: List(x)
    }

}
