package challenges.arithmetic

import P36.primeFactorMultiplicity

object P37 {

  def totient(i: Int): Int = primeFactorMultiplicity(i).foldLeft(1) { (r, f) => f match { case (p, m) => r * (p - 1) * Math.pow(p, m - 1).toInt } }

}
