object Solution {

  def main(args: Array[String]) {
    var a="abcde"
    var b="pqrst"
    println(a)
    var a_char=a.toList
    var b_char=b.toCharArray()
    var c_char:List[Char]=List()
    for(i <-  1 to a_char.length)
      {
        c_char=c_char :+ a_char(i)
        println(a)
        c_char=c_char :+ b_char(i)
      }
    println(c_char.toString())

  }
}

