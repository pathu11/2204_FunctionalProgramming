object q5 {
  def totalRunningTime(distance_1: Int, time_1: Int, distance_2: Int, time_2: Int, distance_3: Int, time_3: Int): Int = {
    return (distance_1 * time_1) + (distance_2 * time_2) + (distance_3 * time_3)
  }

  def main(args: Array[String]): Unit = {
    println("Total running time: " + totalRunningTime(2, 8, 3, 7, 2, 8) + " min")
  }
}
