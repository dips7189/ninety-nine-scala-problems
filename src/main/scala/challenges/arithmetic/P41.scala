package challenges.arithmetic

object P41 {

  def printGoldbachList(r: Range) = {
    r.foreach(i => P40.goldbach(i).foreach(x => println(i + " = " + x._1 + " + " + x._2)))
  }

  def printGoldbachList_(r: Range) = {
    r.foreach(i => P40._goldbach_(i).foreach(x => println(i + " = " + x._1 + " + " + x._2)))
  }

}
