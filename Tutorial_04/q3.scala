

object q3 {
  def toUpper(str: String): String = str.toUpperCase()

  def toLower(str: String): String = str.toLowerCase()

  def formatNames(name: String)(formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {
    val test = Array("Benny", "Niroshan", "Saman", "Kumara")

    for (i <- 0 until test.length) {
      val formattedNameUpperCase = formatNames(test(i))(toUpper)
      val formattedNameLowerCase = formatNames(test(i))(toLower)
      println(formattedNameUpperCase)
      println(formattedNameLowerCase)
    }
  }

}


