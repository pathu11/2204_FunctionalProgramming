import scala.io.StdIn
object q1{
  def ReverseString(str: String): String = {
    if (str.isEmpty) {
      ""
    } else {
      ReverseString(str.tail) + str.head
      //str.tail represents the substring of str excluding its first character
    }
  }


  def main(args: Array[String]): Unit = {
    print("Enter the string\n");

    val name=StdIn.readLine();
    print("Reversed String :" +ReverseString(name));
  }

}
