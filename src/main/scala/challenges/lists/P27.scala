package challenges.lists

object P27 {

    import P26.combinations

    def group3[A](l: List[A]): List[List[List[A]]] =
        for {
            a <- combinations(2, l)
            notA = l diff a
            b <- combinations(3, notA)
        } yield List(a, b, notA diff b)

    def group[A](ks: List[Int], l: List[A]): List[List[List[A]]] = ks match {
        case Nil => List(Nil)
        case n :: ns => combinations(n, l) flatMap { c => group(ns, l diff c) map { c :: _ } }
    }

}
