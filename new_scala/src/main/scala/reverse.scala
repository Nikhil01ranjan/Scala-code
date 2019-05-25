object reverse {
  def main(args: Array[String]): Unit =
  {
    val l1=List(1,3,4,5,6,7,8,9)
    println(f(l1))
  }
  def f(arr:List[Int]):List[Int] =
  {
    val a=arr.length-1
    var l:List[Int]=List()
    for(x <- 0 to a)
    {
      l=l :+ arr(a-x)

    }
    l

  }
}
