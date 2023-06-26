object q3 {
  def getAverage(num1: Int, num2: Int): Float = {
    val average: Float = ((num1 + num2) / 2.toFloat)
    "%.2f".format(average).toFloat
  }

  def main(args: Array[String]): Unit = {
    val n1: Int = 10
    val n2: Int = 20
    println("Average of two numbers: " + getAverage(n1, n2))
  }
}
