package com.vinay.scala.prg3.functions

/**
 * Scala Functions :: Default Parameter Values for a Function
 * Scala also specify default values for function parameters.
 * The argument for such a parameter can optionally be omitted from a function call,
 * in which case the corresponding argument will be filled in with the default.
 *
 */
object VinayPrg7 {

  def main(args: Array[String]) {
    var a = 10;
    var b = 20;
    var c = 10;
    println("Sum of Two Numbers : " + sum(a, b))

    // Will give Compile Time Error if Method Overloading is done
    // Can be checked by un-commenting the commented code
    println("Sum of Two Numbers : " + sum())

    // println("Sum of Two Numbers : " + sum(a, b, c))
  }

  def sum(firstValue: Int = 5, secondValue: Int = 5): Int = {
    var totalValue = firstValue + secondValue
    return totalValue
  }

  // def sum(firstValue: Int = 5, secondValue: Int = 5, thirdValue: Int = 5): Int = {
  // var totalValue = firstValue + secondValue + thirdValue
  // return totalValue
  //  }
}