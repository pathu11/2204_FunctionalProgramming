object q4 {
  def isEven(n:Int):Boolean=n match{
    case 0=>true
    case 1 =>false
    case _ =>isEven(n-2)

  }

  def checkEvenOdd(n:Int):String=n match{
    case x if(isEven(n))=>"Even"
    case _=>"Odd"

  }


  def main(args:Array[String]): Unit = {
    print("Enter the number :")
    var num=scala.io.StdIn.readInt()
    print(checkEvenOdd(num))

  }

}
