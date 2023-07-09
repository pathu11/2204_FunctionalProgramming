import scala.io.StdIn
object q3 {
  def sum(n:Int):Int=n match{
    case x if(n<=0) =>0
    case _=> n+sum(n-1)
  }
  def main(args :Array[String]): Unit = {
    print("Enter the number :")
    var num=StdIn.readInt()
    print("Sum  :" +sum(num))

  }

}
