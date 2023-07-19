package example

class x07_Function {

  /**
   * val 定义函数， 函数是一个对象，可以赋值给一个变量
   * def 定义方法, 方法是类的一部分
   */
  def m(x: Int) = x + 3

  val f = (x: Int) => x + 3


}

class People{

  def speak(): Unit ={
    println("这是一个函数，也是一个方法")
  }
}

object Main{
  def main(args: Array[String]): Unit = {
    // class 中定义 main 无法执行，object 中main方法可执行
    println("Test")
  }
}