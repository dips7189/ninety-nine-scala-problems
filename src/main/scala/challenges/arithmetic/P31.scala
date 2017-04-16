package challenges.arithmetic

object P31 {

    def isPrime(i: Int): Boolean = !((2 until Math.sqrt(i).toInt) exists (i % _ == 0))

    def isPrime_(i: Int): Boolean = (2 to i) takeWhile { (_ <= Math.sqrt(i).toInt) } forall (i % _ != 0)

    def isPrime_usingFermatsLittleTheorem(i: Int): Boolean = {
        val i2 = BigInt(i)
        val fermatProof = (a: BigInt) => a.modPow((i2 - 1), i2) == 1
        (2 to 12).exists(fermatProof(_))
    }

}