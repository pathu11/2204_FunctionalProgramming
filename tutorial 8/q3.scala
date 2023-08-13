import scala.io.StdIn
object q3 {
  val toUpper:String=>String=str=>str.toUpperCase()
  val toLower:String=>String=str=>str.toLowerCase()
  val formatNames:(String => String) =>String=>String=function=>name=>function(name)
  def main(args: Array[String]): Unit = {
    println("Enter the string")
    var str=StdIn.readLine()
    println(formatNames(toUpper)(str))
    println(formatNames(toLower)(str))

  }


}
