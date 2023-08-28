object q1 {
  def calculateAverage(tempInCelsius: List[Int]): Double = {
    val TempInFahrenheit = tempInCelsius.map(tempInCelsius => ((tempInCelsius * 9)/5) + 32)
    val sum = TempInFahrenheit.reduce((x, y) => x + y)
    val average = sum / tempInCelsius.length
    average
  }

  def main(args: Array[String]): Unit = {
    val temperature = List(0, 10, 20, 30)
    println("Average Fahrenheit temperature: " + calculateAverage(temperature))
  }
}
