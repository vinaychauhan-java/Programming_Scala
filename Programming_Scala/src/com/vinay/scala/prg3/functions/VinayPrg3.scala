package com.vinay.scala.prg3.functions
/**
 * Scala Functions :: Call-by-Name
 *
 * Typically, parameters to functions are by-value parameters; that is, the value
 * of the parameter is determined before it is passed to the function.
 * But what if we need to write a function that accepts as a parameter an expression
 * that we don't want evaluated until it's called within our function?
 * For this circumstance, Scala offers call-by-name parameters.
 *
 * A call-by-name mechanism passes a code block to the callee and each time the callee
 * accesses the parameter, the code block is executed and the value is calculated.
 */

object VinayPrg3 {
  def main(args: Array[String]) {
    letsDelayMessage(getTime())
  }

  def getTime() = {
    println("In Method :: getTime")
    System.nanoTime()
  }

  //Function having call-by-name parameter by putting the => symbol between the variable name and the type
  def letsDelayMessage(value: => Long) = {
    println("In Method :: letsDelayMessage")
    // A call-by-name mechanism passes a code block to the callee 
    // and each time the callee accesses the parameter, the code block is executed and the value is calculated.  
    println("Value is :: " + value) // First-Call
    value // Second-Call
  }
}