object test1
  {
    def main(args: Array[String]): Unit =
    {
      var v1=1
      var v2=3
      var v3=0
      println(v1)
      println(v2)
      for(a <- 1 to 10)
        {
          v3=v1+v2
          v1=v2
          v2=v3
          println(v3)
        }
    }
  }