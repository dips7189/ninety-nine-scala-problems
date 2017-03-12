package challenges.lists

object P28 {

    def lsort[X](l: List[List[X]]): List[List[X]] = l sortWith (_.length < _.length)

    def _lsort[X](l: List[List[X]]): List[List[X]] = l sortBy (_.length)

    def lsortFreq[X](l: List[List[X]]): List[List[X]] = l.groupBy(_.size).values.toList.sortWith(_.length < _.length).flatten
    
    def _lsortFreq[X](l: List[List[X]]): List[List[X]] = (l groupBy (_.size)).toList sortBy(_._1) flatMap(_._2)
}
