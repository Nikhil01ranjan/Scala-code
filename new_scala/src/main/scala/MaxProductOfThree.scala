object MaxProductOfThree {
  def main(args: Array[String]): Unit =
  {
    var a:Array[Int]=Array(1,3,5,9,-1,-5,-10)
    var b=a.sorted
    var len=b.length
    //var c=a.map{x => x.abs}.sorted
    var neg_mul=b(0)*b(1)
    var pos_mul=b(len-1) * b(len-2)
    //var mul1=c(len-1) * c(len-2) * c(len-3)
    if(pos_mul < neg_mul) {
      var c=a.map{x => x.abs}.sorted
      println(c(len-1) * c(len-2) * c(len-3))
    }
    else
      {
        var mul=b(len - 1) * b(len - 2) * b(len - 3)
        var mul1=b(0) * b(1) * b(len - 1)
        if(mul > mul1)
          println(mul)
        else
          println(mul1)
      }

   /*
    var count=0
    if((c(len-1)==b(len-1))||(c(len-1)==b(len-2))||(c(len-1)==b(len-3)))
      {
        count=count+1
        println("hi" + c(len-1))
      }
    if((c(len-2)==b(len-1))||(c(len-2)==b(len-2))||(c(len-2)==b(len-3)))
    {
      count=count+1
      println("hiii" + c(len-2))
    }
    if((c(len-3)==b(len-1))||(c(len-3)==b(len-2))||(c(len-3)==b(len-3)))
    {
      count=count+1
      println("hel" + c(len-3))
    }
    if(count==1)
      println(mul1)
    else
      println(mul)
*/
  }
}
