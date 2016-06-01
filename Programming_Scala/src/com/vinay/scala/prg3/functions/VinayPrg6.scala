package com.vinay.scala.prg3.functions
/**
 * Scala Functions :: Recursion
 * Recursion plays a big role in pure functional programming and Scala supports
 * recursion functions very well. Recursion means a function can call itself repeatedly
 *
 */
object VinayPrg6 {
  def main(args: Array[String]) {
    for (i <- 1 to 20)
      println("Factorial of " + i + " : = " + myFactorial(i))
  }

  def myFactorial(number: BigInt): BigInt = {
    if (number <= 1)
      1
    else
      number * myFactorial(number - 1)
  }
}