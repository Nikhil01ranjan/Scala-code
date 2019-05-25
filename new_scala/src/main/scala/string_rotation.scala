object string_rotation {
  def main(args:Array[String]): Unit =
  {
    var n=scala.io.StdIn.readInt()
    for(j <- 1 to n)
      {
        var a=scala.io.StdIn.readLine()
        var res:List[String]=func(a)
        res.foreach(print)
        println()
      }
  }
  def func(a:String): List[String] =
  {

    var b=a.toCharArray
    var len=b.length
    var list:List[String]=List()
    for(k <- 1 to len)
    {
      var l:Array[Char]=Array()
      for(i <- 1 to len-1)
      {

        l=l :+ b(i)
      }
      l=l :+ b(0)
      list=list :+ l.mkString
      list=list :+ " "
      b=l.mkString.toCharArray
    }
    list
  }
}
