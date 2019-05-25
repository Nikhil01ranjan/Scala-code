object CyclicRotation_array {
  def main(args:(Array[String])): Unit =
  {
    var a:List[Int]=List(1, 2,4,5,6,34,56,77,99)
    var k=8
    var b:List[Int]=List()
    var len=a.length

    for(i <- 0 to k-1)
      {
        b=b :+ a(len-k + i)
      }
    for(i <- 0 to len-1-k)
    {

      b=b :+ a(i)
    }


    b.foreach(println)
  }
}
