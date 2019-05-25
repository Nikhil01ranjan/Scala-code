object mainObject {
  def main(args: Array[String]) {
    val l1=List(1,3,4,5,6,7,8,9)
    println(f(l1))
  }
  def f(arr:List[Int]):List[Int] =
  {
    var l:List[Int]=List()
    for(a <- 1 to arr.length-1 by 2)
      {
        l=l :+ arr(a)
      }
    l
  }


}