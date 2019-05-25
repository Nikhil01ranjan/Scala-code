object PassingCars_0_1_index_pair {
  def main(args: Array[String]): Unit =
  {
    var a:List[Int]=List(0,1,0,1,1,0,1)
    var x=a.count(_==0)
    var y=a.count(_==1)
    var count=0
    for(i <- 0 to a.length-1)
    {
      if(a(i)==0)
      {
        for (j <- i+1 to a.length - 1)
        {
          if(a(j)==1)
            count=count+1

        }
      }
    }
    println(count)
  }
}
