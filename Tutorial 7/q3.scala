import scala.io.StdIn
object q3 {
  def isPrime(n:Int):Boolean={
    if(n==1) return false;
    else if (n==2)  return true;
    else if (n%2==0) return false;
    else{
      val sqrtNum = math.sqrt(n).toInt
      for (i <- 3 to sqrtNum by 2) {
        if(n%i==0) return false
      }
      true

    }

  }


  def filterprime(num:List[Int]):List[Int]={
    num.filter(isPrime)
  }
  def main(args: Array[String]): Unit = {
    println("Enter a list of numbers separated by comma:")
    val numbers = StdIn.readLine().split(",").map(_.toInt).toList
    println(filterprime(numbers))
  }

}
