import scala.io.StdIn

object q1 {
  def filterEvenNumbers(num:List[Int]):List[Int]={
     num.filter(num=>(num%2==0))
  }
  def main(args: Array[String]): Unit = {

    println("Enter a list of numbers separated by comma:")
    val numbers=StdIn.readLine().split(",").map(_.toInt).toList
    println(filterEvenNumbers(numbers))
  }


}
