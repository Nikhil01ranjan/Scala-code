import java.util.Arrays

object test {

  def main(args: Array[String]): Unit = {
    var t = scala.io.StdIn.readInt()
    while (t > 0) {
      t = t - 1;
      val Array(n, k) = scala.io.StdIn.readLine().trim().split(" +").map(_.toInt)
      val a = scala.io.StdIn.readLine().trim().split(" +").map(f => f.toInt).toArray[Int]
      val h = scala.collection.mutable.HashMap[Int, Int]();
      for (i <- a)
        h.put(i, h.getOrElse(i, 0) + 1)
      var was = false
      for (i <- a)
        if (h.getOrElse(i, 0) >= k) {
          if (was)
            print(" ")
          was = true;
          print(i)
          h.remove(i)
        }
      if (!was)
        print(-1)
      println
    }
  }

}