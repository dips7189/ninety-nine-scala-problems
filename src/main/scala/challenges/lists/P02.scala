package challenges.lists

import scala.annotation.tailrec

object P02 {

    def penultimateUsingFoldLeft[X](l: List[X]): X = l.foldLeft((l head, l.tail.head)) { (x, y) => (x._2, y) }._1

    @tailrec
    def penultimateUsingPatternMatching[X](l: List[X]): Option[X] = l match {
        case x :: _ :: Nil => Some(x)
        case _ :: xs => penultimateUsingPatternMatching(xs)
        case _ => None
    }

    def penultimateUsingBuiltIn[X](l: List[X]): Option[X] = {
        if (l isEmpty) None
        else Some(l.init.last)
    }
}
