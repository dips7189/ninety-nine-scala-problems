package challenges.lists

import scala.annotation.tailrec

object P03 {

    def nthUsingBuiltInLift[X](n: Int, l: List[X]): X = l.lift(n).get

    def nthUsingBuiltInDrop[X](n: Int, l: List[X]): X = l.drop(n - 1).head

    def nthUsingBuiltIn[X](n: Int, l: List[X]): Option[X] = if(n < 0 || n >= l.size) None else Some(l(n))

    @tailrec
    def nthUsingPatternMatching[X](n: Int, l: List[X]): Option[X] = l match {
        case Nil => None
        case x :: xs => if(n < 0) None else if(n == 0) Some(x) else nthUsingPatternMatching(n - 1, xs)
    }

    def nthUsingPatternMatchingAgain[X](n: Int, l: List[X]): Option[X] = (n, l) match {
        case (0, x :: _) => Some(x)
        case (k, _ :: xs) => nthUsingPatternMatchingAgain(k -1, xs)
        case (_, Nil) => None
    }

}
