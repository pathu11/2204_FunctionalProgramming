import scala.io.StdIn
object q2 {
  def prime(n: Int, i: Int = 2): Boolean = n match {
    case x if (x <= 1) => false
    case x if (x <= i) => true
    case x if (x % i == 0) => false
    case _ => prime(n, i + 1)

  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current < n) {
      if (prime(current))
        print(current + " ,")
      primeSeq(n, current + 1)
    }
  }


  def main(args :Array[String]): Unit = {
    print("Enter the number :")
    var num = StdIn.readInt()
    primeSeq(num);

  }

}
