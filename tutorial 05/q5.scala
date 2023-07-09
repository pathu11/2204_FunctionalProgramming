object q5 {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case 1 => false
    case _ => isEven(n - 2)
  }

  def sumOfInt(n: Int): Int = n match {
    case 0 => 0
    case x if isEven(n) => (n-2) + sumOfInt(n - 1)
    case _ => sumOfInt(n - 1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number :")
    var num = scala.io.StdIn.readInt()
    println(sumOfInt(num))
  }
}
