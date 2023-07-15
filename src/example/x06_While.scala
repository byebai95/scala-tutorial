package example

object x06_While {
  def main(args: Array[String]): Unit = {
    var a = 10
    // 死循环
    while (true){
      println(a)
    }
  }
}
