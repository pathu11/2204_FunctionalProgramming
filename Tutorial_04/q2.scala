import scala.io.StdIn
object q2 {
  def PatternMatching(input:Int):String=input match{
    case x if x<0 =>"Negative"
    case x if x==0 =>"Zero"
    case x if (x>0 && x%2==0)=>"Even number"
    case x if (x>0 && x%2!=0)=>"Odd number"
  }
  def main(args: Array[String]): Unit = {
    print("Enter the pattern :");
    var pattern=StdIn.readInt()
    print("Type of Pattern :"+PatternMatching(pattern))
  }

}
