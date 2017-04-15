package challenges.arithmetic

import P35.primeFactors
import challenges.lists.P10.encode

object P36 {

  def primeFactorMultiplicity(i: Int): Map[Int, Int] = primeFactors(i) groupBy(identity) mapValues(_.size)

  def primeFactorMultiplicity_(i: Int): Map[Int, Int] = primeFactors(i) groupBy(l => l) map(t => (t._1, t._2 length))

  def _primeFactorMultiplicity(i: Int): List[(Int, Int)] = encode(primeFactors(i)).map(_.swap)


}
