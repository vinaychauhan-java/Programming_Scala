package com.vinay.scala.prg3.functions
/**
 * Scala Functions :: Named Arguments
 * In a normal function call, the arguments in the call are matched one by one in the 
 * order of the parameters of the called function. Named arguments allow you to pass arguments 
 * to a function in a different order. 
 * The syntax is simply that each argument is preceded by a parameter name and an equals sign.
 */

object VinayPrg4 {
  def main(args: Array[String]) {
    printValues(a = 10, b = 20)

  }
  def printValues(b: Int, a: Int) {
    println("Value for a : " + a)
    println("Value for b : " + b)
  }
}