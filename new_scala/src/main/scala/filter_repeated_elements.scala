object filter_repeated_elements {
  def main(args: Array[String]): Unit =
  {
    var num_test:Int=scala.io.StdIn.readInt()
    for(a <- 1 to num_test)
      {
        var inp_data=scala.io.StdIn.readLine().split(" ").map(_.toInt)
        var num_list=scala.io.StdIn.readLine().split(" ").map(_.toInt)

        var temp=0
        //var num_set:Set[Int]=num_list.toSet
        var num_set=num_list.distinct

        var num_length:Int=inp_data(0)

        for(a <- 0 to num_set.size-1)
        {
          var count=0

         // println(num_set(a))
          for(i <- 0 to num_length-1)
            {
              if(num_set(a)==num_list(i))
                count=count+1
            }
          if(count >= inp_data(1))
          {
            print(num_set(a) + " ")
            temp=1
          }

        }
        println()
        if(temp == 0) {
          println(-1)
        }
      }
  }
}
