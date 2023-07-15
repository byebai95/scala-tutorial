package example

object x02_OverLoad {

  def myMethod(): Unit = {
    println("method Test")
  }

  // 方法重载
  def myMethod(x :Int): Unit = {
    println("method args Test", x)
  }

  def main(args: Array[String]): Unit = {
    myMethod()
    myMethod(10)
  }
}
