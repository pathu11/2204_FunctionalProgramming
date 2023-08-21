class Rational(var num:Int){
  def neg(): Rational = {
    new Rational(-num)
  }
  def sub(other: Rational): Rational =
    new Rational(num - other.toInt)

  def toInt: Int = num
  override def toString: String = s"$num"
}
object q1{
  def main(args: Array[String]): Unit = {
    val rational = new Rational(20)
    val negRational = rational.neg()
    println("Negation of the number :" +negRational.num)
    val x = new Rational(3)
    val y = new Rational(5)
    val z = new Rational(2)
    val result=x.sub(y).sub(z)
    println("Substraction of three numbers :"+result)
  }
}