package challenges.lists

import scala.annotation.tailrec

object P03 {

    def nthUsingBuiltInLift[X](n: Int, l: List[X]): X = l.lift(n).get

    def nthUsingBuiltInDrop[X](n: Int, l: List[X]): X = l.drop(n - 1).head

    def nthUsingBuiltIn[X](n: Int, l: List[X]): Option[X] = if(n < 0 || n >= l.size) None else Some(l(n))

    @tailrec
    def nthUsingPatternMatching[X](n: Int, l: List[X]): X = l match {
        case Nil => throw new NoSuchElementException
        case x :: xs => if(n < 0) throw new NoSuchElementException else if(n == 0) x else nthUsingPatternMatching(n - 1, xs)
    }

    def nthUsingPatternMatchingAgain[X](n: Int, l: List[X]): X = (n, l) match {
        case (0, x :: _) => x
        case (k, _ :: xs) => nthUsingPatternMatching(k -1, xs)
        case (_, Nil) => throw new NoSuchElementException
    }

}
