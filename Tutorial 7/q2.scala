import scala.io.StdIn
object q2 {
  def calculateSquare(num:List[Int]):List[Int]={
    num.map(num=>num*num)
  }
  def main(args:Array[String]): Unit = {
    println("Enter a list of numbers separated by comma:")
    val numbers=StdIn.readLine().split(",").map(_.toInt).toList
    println(calculateSquare(numbers))
  }


}
