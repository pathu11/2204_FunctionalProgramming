object q2 {
  def countLetterOccurrences(str:List[String]):Int={
    val len=str.map(str=>str.length)
    val totalCountOfLetters=len.reduce((x,y) => x + y)
    totalCountOfLetters
  }
  def main(args: Array[String]): Unit = {
    val string=List("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences: "+countLetterOccurrences(string))
  }

}
