class Account_1( private var balance: Double) {
  def getBalance: Double = balance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
    }
  }

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.1
    }
  }
}

class Bank(val accounts: List[Account_1]) { // Change to val instead of private val
  def accountsWithNegativeBalance: List[Account_1] =
    accounts.filter(account => account.getBalance < 0)

  def totalBalance: Double =
    accounts.map(_.getBalance).sum

  def applyInterestToAllAccounts(): Unit =
    accounts.foreach(_.applyInterest())
}

object BankExample {
  def main(args: Array[String]): Unit = {
    val account1 = new Account_1(100)
    val account2 = new Account_1(-200)
    val account3 = new Account_1(500)

    val bank = new Bank(List(account1, account2, account3))

    println("Accounts with negative balances:")
    bank.accountsWithNegativeBalance.foreach(account => println(s"Account balance: ${account.getBalance}"))

    println(s"Total balance of all accounts: ${bank.totalBalance}")

    bank.applyInterestToAllAccounts()
    println("Balances after applying interest:")
    bank.accounts.foreach(account => println(s"Account balance: ${account.getBalance}"))
  }
}
