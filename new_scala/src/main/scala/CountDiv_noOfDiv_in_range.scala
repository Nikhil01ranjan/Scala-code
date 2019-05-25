object CountDiv_noOfDiv_in_range {
  def main(args: Array[String]): Unit =
  {

  }
  def func(a: Int, b: Int, k: Int): Int =
  {

    var count=0
    for(i <- a to b)
    {
      if(i%2==0)
        count=count+1
    }
    count
  }
}
