package com.vinay.scala.prg5.classesAndObjects

class Account(val pAccountNumber: Int, val pAmount: Int) {
  var accountNumber = pAccountNumber
  private var amount = pAmount

  def getBalanceDetails() {
    println("Account Number    : " + accountNumber);
    println(" - Account Amount : " + amount);
  }
}

// We can extend a base scala class in similar way you can do it in Java but there are two restrictions:
// (1) method overriding requires the override keyword, 
// (2) only the primary constructor can pass parameters to the base constructor.
class SavingAccount(override val pAccountNumber: Int, override val pAmount: Int, val pAccountType: String)
    extends Account(pAccountNumber, pAmount) {
  private var accountType = pAccountType

  def getAccountType(): String = {
    return " - Account Type   : " + accountType
  }
}

class CheckingAccount(override val pAccountNumber: Int, override val pAmount: Int, val pAccountType: String)
    extends Account(pAccountNumber, pAmount) {
  private var accountType = pAccountType

  def getAccountType(): String = {
    " - Account Type   : " + accountType
  }
}

// Scala is more object-oriented than Java because in Scala we cannot have static members.
// A singleton is a class that can have only one instance, i.e., object. 
// We create singleton using the keyword object instead of class keyword. 
// Since we can't instantiate a singleton object, we can't pass parameters to the primary constructor
object VinayPrg3 {
  def main(args: Array[String]) {
    var mySavAccount = new SavingAccount(1001, 500, "SAVING")
    mySavAccount.getBalanceDetails()
    println(mySavAccount.getAccountType())

    println("***************************************************")

    var myChkAccount = new CheckingAccount(9999, 500, "CHECKING")
    myChkAccount.getBalanceDetails()
    println(myChkAccount.getAccountType())
  }
}