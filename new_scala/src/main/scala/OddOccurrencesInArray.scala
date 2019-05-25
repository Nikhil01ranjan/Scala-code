object OddOccurrencesInArray {
  def main(args: Array[String]): Unit =
  {
    var a:List[Int]=List(1,2,3,4,5,1,2,3,4,1,2)
    var b=a.distinct
    for(i <-0 to b.length-1)
    {
      var count=0
      for(j <- 0 to a.length-1)
      {
        if(a(j)==b(i))
          count=count+1

      }
      if(count%2!=0)
        {
          println(b(i))
        }
    }
  }
}
