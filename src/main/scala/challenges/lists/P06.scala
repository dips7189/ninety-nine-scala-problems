package challenges.lists

import scala.annotation.tailrec

object P06 {

    def isPalindromeUsingBuiltIn[X](l: List[X]): Boolean = l == l.reverse

    @tailrec
    def isPalindromeUsingPatternMatching[X](l: List[X]): Boolean = l match {
        case Nil => true
        case List(x) => true
        case xs => (xs.head == xs.last) && isPalindromeUsingPatternMatching(xs.tail.init)
    }

    @tailrec
    def isPalindromic[X](l: List[X]): Boolean = l match {
        case Nil => true
        case List(x) => true
        case ::>(first, last, rest) => (first == last) && isPalindromic(rest)
    }

    object ::> {
        def unapply[X](l: List[X]) = l match {
            case Nil => None
            case l => Some(l.head, l.last, l.init.tail)
        }
    }

}
