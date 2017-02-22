package challenges.lists

object P15 {

    def duplicateN[X](n: Int, l: List[X]): List[X] = l.foldLeft(List[X]())((acc, x) => acc ::: List.fill(n)(x))

    def duplicateN_[X](n: Int, l: List[X]): List[X] = l match {
        case Nil => Nil
        case x :: xs => List.fill(n)(x) ::: duplicateN_(n, xs)
    }

    def _duplicateN[X](n: Int, l: List[X]): List[X] = l flatMap (x => List.fill(n)(x))
}
