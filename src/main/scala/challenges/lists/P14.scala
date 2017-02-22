package challenges.lists

object P14 {

    def duplicate[X](l: List[X]): List[X] = l.foldLeft(List[X]())((acc, x) => acc ::: List(x, x))

    def duplicate_[X](l: List[X]): List[X] = l match {
        case Nil => Nil
        case x :: xs => List(x,x) ::: duplicate_(xs)
    }

    def _duplicate[X](l: List[X]): List[X] = l flatMap (x => List(x, x))

}
