object count {
  def main(args: Array[String]): Unit =
  {
    val l1=List(1,3,4,5,6,7,8,9)
    println(f(l1))
  }
  def f(arr:List[Int]):Int =
  {
    var co:Int=0
    var itr=arr.iterator
    while(itr.hasNext)
      {
        itr.next()
        co=co+1
      }
    co
  }
}
