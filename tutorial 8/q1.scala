import scala.io.StdIn
object q1 {
  def calculateInterest(deposit:Int):Double={
    val interestFunc:Double=>Double={
      case x if x<=20000 =>x*0.02;
      case x if x<=200000 =>x*0.04;
      case x if x<=2000000 =>x*0.035;
      case x =>x*0.065;

    }
    val interest=interestFunc(deposit)
    interest


  }
  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount")
    val depositAmount=StdIn.readInt()
    println(calculateInterest(depositAmount))

  }

}
