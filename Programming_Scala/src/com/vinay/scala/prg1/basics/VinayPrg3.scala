package com.vinay.scala.prg1.basics

object VinayPrg3 {
  def main(args: Array[String]) {
    /* Example for Variable Type Inference :-
     * When we assign an initial value to a variable, the Scala compiler can figure out 
     * the type of the variable based on the value assigned to it. 
     * This is called Variable Type Inference.*/

    var firstValue = 10
    var secondValue = 10
    var totalValue = firstValue + secondValue

    println("Total Value :" + totalValue)

  }
}