package challenges.lists

object P13 {

    def encodeDirect[T](list: List[T]) = list.foldLeft(List[(Int, T)]()) { (res, t) =>
        res.reverse match {
            case Nil => (1, t) :: Nil
            case head :: xs => head match {
                case (x, i) if i == t => xs.reverse ::: List((x + 1, t))
                case (x, i) => (List((1, t)) ::: (head :: xs)).reverse
            }
        }
    }

}
