package com.vinay.scala.prg1.basics

object VinayPrg4 {
  def main(args: Array[String]) {

    // Example for Multiple Assignments

    // val (firstValue: Int, secondValue: Int) = Pair(10, 10)
    // val totalValue = firstValue + secondValue
    // println("Total Value :" + totalValue);

    val (firstValue, secondValue) = Pair(10, 10)
    val totalValue = firstValue + secondValue
    println("Total Value :" + totalValue);

    val (value1, value2) = Pair(1, "Greetings")
    print("value1 :: " + value1);
    println(" || value2 :: " + value2);

  }
}