object string_reduction {
  def main(args: Array[String]): Unit =
  {
    var a=scala.io.StdIn.readLine()
    var b=a.split("")
    var c=b.distinct
    println(c.mkString)
  }
}
