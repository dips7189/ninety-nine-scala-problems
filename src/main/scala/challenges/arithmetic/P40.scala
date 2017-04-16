package challenges.arithmetic

import P31.isPrime_
import P39.listPrimesInRange

import scala.annotation.tailrec

object P40 {

    def goldbach(i: Int): List[(Int, Int)] = {

        @tailrec
        def find(i: Int, primes: List[Int], found: List[(Int, Int)]): List[(Int, Int)] = primes match {
            case x :: xs if primes contains (i - x) => find(i, primes.drop(1), (x, i - x) :: found)
            case x :: xs => find(i, primes.drop(1), found)
            case _ => found
        }

        find(i, listPrimesInRange(2 to i), List()) reverse
    }

    def _goldbach_(i: Int): Either[String, (Int, Int)] = {
        listPrimesInRange(2 to i).takeWhile(_ <= i).find(e => isPrime_(i - e)) match {
            case None => Left("no paired primes found that summate to: " + i)
            case Some(x) => Right((x, i - x))
        }
    }

}
