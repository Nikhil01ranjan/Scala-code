object sum_odd_intgr
{
  def main(args: Array[String]): Unit =
  {
    val l1=List(1,3,-5)
    println(f(l1))
    println(-5%2)
  }
  def f(arr:List[Int]):Int =
  {
    var sum:Int=0
    var sum1:Int=0
    arr.map { element =>
      if ((element % 2 == 1) ||(element % 2 == -1)) {
        sum = sum + element
      }
    }

    sum
  }
}
