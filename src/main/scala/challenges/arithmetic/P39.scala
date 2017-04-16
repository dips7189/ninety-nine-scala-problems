package challenges.arithmetic

import P31.isPrime_

object P39 {

    def listPrimesInRange(r: Range): List[Int] = r.filter(isPrime_(_)).toList

}
