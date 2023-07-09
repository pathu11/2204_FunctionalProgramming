object q6 {
  def fib(n:Int):Int=n match{
    case 0=>0
    case 1=>1
    case _=>fib(n-1)+fib(n-2)
  }
  def fibSerious(n:Int): Unit = {
    for (i <- 0 to n) {
      val fibNum = fib(i)
      print(fibNum + ",")
    }
  }

  def main(args:Array[String]): Unit = {
    print("Enter the number :")
    var num = scala.io.StdIn.readInt()
    fibSerious(num)

  }

}
