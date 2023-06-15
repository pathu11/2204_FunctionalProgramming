object q4 {
  def cost(coverPrice: Double, discount: Double, shippingCost50: Double, shippingCostAdd: Double, noOfCopies: Int): Double = {
    var shippingCost: Double = 0;
    var AfterDiscounted: Double = noOfCopies * (coverPrice - (coverPrice * discount));
    if (noOfCopies <= 50) {
      shippingCost = noOfCopies*shippingCost50;
    } else {
      shippingCost = (50 *shippingCost50) + (shippingCostAdd * (noOfCopies - 50));

    }
    return AfterDiscounted + shippingCost;

  }

  def main(args: Array[String]): Unit = {
    println("total wholesale cost :Rs " +cost(24.95, 0.4, 3, 0.75, 60));
  }

}
