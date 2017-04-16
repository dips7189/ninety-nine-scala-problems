package challenges.arithmetic

import scala.annotation.tailrec
import P31.isPrime

object P35 {

    def primeFactors(i: Int): List[Int] = {

        @tailrec
        def factorise(j: Int, k: Int, l: List[Int]): List[Int] = j % k == 0 match {
            case true if isPrime(k) => factorise(j / k, k, k :: l)
            case false if j != 1 => factorise(j, k + 1, l)
            case false => l
        }

        factorise(i, 2, List[Int]()) reverse
    }

    def primeFactors_(i: Int): List[Int] = {

        @tailrec
        def factorise(j: Int, k: Int, l: List[Int]): List[Int] = k * k > j match {
            case false if j % k == 0 => factorise(j / k, k, k :: l)
            case false => factorise(j, k + 1, l)
            case true => j :: l
        }

        factorise(i, 2, List[Int]()) reverse
    }

}
