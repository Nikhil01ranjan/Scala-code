object Solution {
  def main(args: Array[String]) {
    /** This will handle the input and output**/

    println(fibonacci(5))

  }

  def fibonacci(x:Int):Int =
  {
    def fib_tail( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fib_tail( n-1, b, a+b )
    }
    return fib_tail( x, 0, 1)
  }


}

