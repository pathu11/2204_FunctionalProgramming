import scala.io.StdIn

object q2 {
  def checkString(mylist: Array[String]): Unit = {
    var mylist2 = Array.empty[String];
    for (i <- 0 until mylist.length) {
      if (mylist(i).length > 5) {
        mylist2 = mylist2 :+ mylist(i)
      }
    }

    println(mylist2.toList)

  }
  def main(args: Array[String]): Unit = {
    print("Enter the length of string list");
    val size = StdIn.readInt();
    val mylist = new Array[String](size);
    print("Enter the list");



    for (i<-0 until size) {
      mylist(i) = StdIn.readLine();
    }
    checkString(mylist);


  }
}
