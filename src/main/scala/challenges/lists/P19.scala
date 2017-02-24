package challenges.lists

object P19 {

    def rotate[X](n: Int, l: List[X]): List[X] = {
        val bound: Int = (n, l) match {
            case (n, _) => if(n < 0) l.size + n else n
            case (n, list) => if (list.size == 0) 0 else n
            case (_, Nil) => 0
        }

        l.drop(bound) ::: l.take(bound)
    }
}
