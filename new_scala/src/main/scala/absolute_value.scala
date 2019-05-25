object absolute_value {
  def main(args: Array[String]): Unit =
  {
    val l1=List(1,3,4,-5,-6,7,8,9)
    println(f(l1))
  }
  def f(arr:List[Int]):List[Int] =
  {
    var l:List[Int]=List()
    for(i <- 0 to arr.length-1)
    {
      if(arr(i) < 0)
        {
          l= l:+(arr(i) * (-1))
        }
      else
        {
          l = l :+ arr(i)
        }
    }
    l

  }
}
