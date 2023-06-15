
object q3 {
  def volumeOfSphere(r:Double): Double={
    return (4/3)*(22/7)*r*r*r;
  }
  def main(args: Array[String]) {
    println("Volume of the Sphere :" +volumeOfSphere(5));
  }
}