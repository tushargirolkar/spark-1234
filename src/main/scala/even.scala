object even {
  def main(args: Array[String]): Unit = {
    val s = 700
    val e = 900

    for (num <- s to e if num % 2 == 0) {
      println(num)
    }}}