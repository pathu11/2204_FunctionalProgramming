object q2 {
  def temparature(celcius: Double): Double = {
    return (1.8000 * celcius) + 32.00;
  }

  def main(args: Array[String]): Unit = {
    println("temperature into Fahrenheit:" +temparature(35));
  }

}
