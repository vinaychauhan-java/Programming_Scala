package com.vinay.scala.prg1.basics

object VinayPrg2 {
  def main(args: Array[String]) {

    // Example for Variable Declaration

    var firstValue: Int = 20;
    var secondValue: Int = 20;
    var totalValue: Int = 0;

    totalValue = firstValue + secondValue
    println("Sum :: " + totalValue) // Will Print :- Sum :: 40

    println("Another Sum :: " + (totalValue + 5)) // Will Print :- Another Sum :: 45

  }
}