package challenges.arithmetic

object P34 {

    def totient(m: Int) = (1 to m).foldLeft(0)((acc, i) => if (P33.isCoprimeTo(i, m)) acc + 1 else acc)

    def totient_(m: Int) = (1 to m) count (i => P33.isCoprimeTo(i, m))

    def _totient_(m: Int) = (1 to m) filter { i => P33.isCoprimeTo(i, m) } length


}
