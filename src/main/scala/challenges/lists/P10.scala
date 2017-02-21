package challenges.lists

object P10 {

    def encode[X](l: List[X]): List[(Int, X)] = {
        P09 pack(l) map(x => (x.size, x.head))
    }

}