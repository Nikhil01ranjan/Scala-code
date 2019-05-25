object FrogRiverOne_max_value_index_from_last {
  def main(args:Array[String]): Unit =
  {
    val n=5
    val a:Array[Int]=Array(1,5,1,4,2,3,5,4)
    val b=a.sorted
    var max_val=b(b.length-1)
    var maax_index=b.indexOf(max_val)
    println(maax_index-1)
  }
}
