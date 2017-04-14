package challenges.arithmetic

import scala.annotation.tailrec

object P32 {

  @tailrec
  def gcd(i: Int, j: Int): Int = if(j == 0) i else gcd(j, i % j)

  @tailrec
  def gcd_(i: Int, j: Int): Int = j match {
    case 0 => i
    case k => gcd_(j, i % j)
  }

}
