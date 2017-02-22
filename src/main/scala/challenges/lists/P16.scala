package challenges.lists

object P16 {

    def drop[X](n: Int, l: List[X]): List[X] = {
        def _drop[X](i: Int, l: List[X], r: List[X]): List[X] = (i, l) match {
            case (1, _ :: xs) => _drop(n, xs, r)
            case (i, x :: xs) => _drop(i - 1, xs, x :: r)
            case (_, Nil) => r
        }

        _drop(n, l, List()).reverse
    }
}
