package challenges.lists

object P20 {

    def removeAt[X](k: Int, l: List[X]): (List[X], X) = {
        val (left, right) = l.splitAt(k)
        (left ::: right.drop(1), right.head)
    }

    def _removeAt[X](k: Int, l: List[X]): (List[X], X) = (l.take(k) ::: l.drop(k+1), l(k))

    def removeAt_[X](k: Int, l: List[X]): (List[X], X) = (l.zipWithIndex.filter(_._2 != k).map(_._1), l(k))

}
