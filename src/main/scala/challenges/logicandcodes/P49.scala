package challenges.logicandcodes

object P49 {

    /**
      * The binary-reflected Gray code list for n bits can be generated recursively from the list
      * for n − 1 bits by reflecting the list (i.e. listing the entries in reverse order),
      * concatenating the original list with the reversed list, prefixing the entries in the original
      * list with a binary 0, and then prefixing the entries in the reflected list with a binary 1.
      */
    def gray(n: Int): List[String] = n match {
        case n if (n == 0) => List("")
        case _ =>
            val prev = gray(n - 1)
            (prev map { "0" + _ }) ::: (prev.reverse map { "1" + _ })
    }


}
