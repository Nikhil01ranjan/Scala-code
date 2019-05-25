object missing_integer {
  def main(args: Array[String]): Unit =
  {
    var a:Array[Int]=Array(-1,1)
    var b=a.sorted
    var c:List[Int]=List()
    b=b.distinct
    var start_val=b(0)
    var last_val=b(b.length -1)
    for(i <- 1 to last_val)
      {
        var temp=0
        //println(b(i))
        for(j <- 0 to a.length-1)
          {

            if(i==a(j) )
              {
                temp=1
              }

          }
        if(temp == 0)
          {
            c=c :+ i
            println(i)
          }

      }
    if(c.length > 0)
      println(c(0))
  }
}
