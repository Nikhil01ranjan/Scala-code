object superdigit_sum_all_digit {
  def main(args: Array[String]): Unit =
  {
    var inp=scala.io.StdIn.readLine().split(" ")
    var k=inp(1).toInt
    var p=inp(0)
    for(i <- 1 to k-1)
      {
        p=p.concat(inp(0))
      }
    var p_sep=p.split("")
    var res=0
    while(p_sep.length >1){
      res=0
      for (i <- 0 to p_sep.length - 1) {
        res = res + p_sep(i).toInt

      }
      p_sep=res.toString().split("")

    }
    println(res)
  }
}
