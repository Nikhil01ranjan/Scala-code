object remove_duplicates {
  def main(args:Array[String]): Unit =
  {
    var a=scala.io.StdIn.readLine()
    var b=a.split("").toList
    var c=b.distinct
    println(c.mkString)
  }
}
