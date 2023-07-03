import scala.io.StdIn
object q1 {
  def findInterest(amount: Int): Double = amount match {

    case x if x < 20000 => x * 0.02;
    case x if x < 200000 => x * 0.04;
    case x if x < 2000000 => x * 0.035;
    case x if x >= 2000000 => x * 0.065;

  }

  def main(args: Array[String]): Unit = {
    print("Enter the amount :")
    val interest = StdIn.readInt()
    print("Interest :"+findInterest(interest))
  }

}
