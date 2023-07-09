package example

object demo_04 {

  def main(args: Array[String]): Unit = {
    // 变量定义 ， var 声明变量， val 声明常量
    val str = "String Test"
    var age: Int = 0
    var address = "北京"
    println(str, age, address)

    // 多变量声明
    var age1, age2 = 20
    println(age1, age2)

    // Unit 类型,等价与 void
    println(Unit)

    // AnyRef ,等价于 所有引用类的超类
    println(AnyRef)


  }
}
