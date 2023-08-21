class Account(private var balance: Double) {
  def getBalance: Double = balance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println("Deposit Amount :"+amount +"=>"+"New Balance :" + balance)
    } else {
      println("Invalid deposit amount")
    }
  }

  def withdraw(amount: Double): Unit = {

    if (amount > 0 && amount <= balance) {
      balance -= amount
      println("Withdrew amount :"+ amount +"=> New balance: "+ balance)
    } else {
      if(amount<0){
        println("Invalid withdrawal amount ")
      }
      else if(!(amount <= balance))
      println("Insufficient balance.")
    }
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      targetAccount.deposit(amount)
      println(s"Transferred $amount to targetAccount=> New balance: $balance")
    } else {
      println("Invalid transfer amount or insufficient balance.")
    }
  }
}

object AccountExample {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    account1.deposit(200.0)
    account1.withdraw(150.0)
    account1.transfer(100.0, account2)

    println("Account 1 balance:"+account1.getBalance)
    println("Account 2 balance: "+account2.getBalance)
  }
}
