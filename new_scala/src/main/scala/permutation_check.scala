object permutation_check {
  def main(args: Array[String]): Unit =
  {
    var a:List[Int]=List(1,2,4,2)
    var temp=0
    var b:List[Int]=a.distinct
    if(b.length !=a.length)
      println("List is not hello permutation")

    var c=a.toSeq.sorted
    if(c(c.length-1)!=a.length)
      println("List is not permutation")


    /*for(i <- 1 to a.length)
      {
        temp=0
        for(j <- 0 to a.length-1)
          {
            if(i == a(j))
              temp=1
          }
        if(temp==0)
          println("List is not permutation")
      }
      */
  }
}
