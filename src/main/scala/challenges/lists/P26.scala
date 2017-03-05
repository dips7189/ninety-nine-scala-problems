package challenges.lists

object P26 {

    def combinations[T](k: Int, l: List[T]): List[List[T]] = l match {
        case Nil => Nil
        case x :: xs =>
            if (k <= 0 || k > l.length) Nil
            else if (k == 1) l map (List(_))
            else combinations(k - 1, xs).map(x :: _) ::: combinations(k, xs)
    }

}
