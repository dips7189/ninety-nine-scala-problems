package challenges.lists

object P21 {

    def insertAt[X](j: X, i: Int, l: List[X]): List[X] = {
        l.splitAt(i) match {
            case (left, right) => left ::: j :: right
        }
    }

    def _insertAt[X](j: X, i: Int, l: List[X]): List[X] = l.take(i) ::: j :: l.drop(i)
}
