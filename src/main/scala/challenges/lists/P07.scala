package challenges.lists

object P07 {

    def flatten[Any](l: List[Any]): List[Any] = l match {
        case Nil => Nil
        case (x: List[Any]) :: xs => flatten(x) ::: flatten(xs)
        case x :: xs => x :: flatten(xs)
    }

    def flattenUsingFlatMap(l: List[Any]): List[Any] = l flatMap {
        case xs: List[_] => flattenUsingFlatMap(xs)
        case x => List(x)
    }

}
