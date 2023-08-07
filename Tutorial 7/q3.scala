import scala.io.StdIn
object q3 {

def isPrime(num: Int): Boolean = {
  if (num <= 1) false
  else if (num <= 3) true
  else {
    val sqrtNum = math.sqrt(num).toInt
    (2 to sqrtNum).forall(i => num % i != 0)
  }
}


  def filterprime(num:List[Int]):List[Int]={
    num.filter(num=>isPrime(num))
  }
  def main(args: Array[String]): Unit = {
    println("Enter a list of numbers separated by comma:")
    val numbers = StdIn.readLine().split(",").map(_.toInt).toList
    println(filterprime(numbers))
  }

}
