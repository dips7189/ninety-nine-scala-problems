package challenges.lists

object P11 {

    def encodeModified[X](l: List[X]): List[Any] = P10.encode(l).foldLeft(List[Any]())((r,v) => {
        if(v._1 == 1) r :+ v._2 else r :+ v
    })

    def encodeModifiedUsingMap[X](l: List[X]): List[Any] = P10.encode(l) map { x => if(x._1 == 1) x._2 else x }
}
