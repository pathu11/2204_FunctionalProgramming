import scala.io.StdIn

object q2 {
  val isEven:Int=>Boolean=num=>num%2==0

  def patternMatching(num: Int): String = {
    val result = num match {
      case n if n < 0 && isEven(num) => "Negative even number"
      case n if n < 0 => "Negative Odd number"
      case 0 => "Zero"
      case n if isEven(num) => "Positive even number"
      case _ => "Positive Odd number"
    }
    result
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number:")
    val number = StdIn.readInt()
    val result = patternMatching(number)
    println(result)
  }
}
