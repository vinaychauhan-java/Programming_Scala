package com.vinay.scala.prg3a.closures
/**
 * Scala Program: Closures
 * A closure is a function, whose return value depends on the value of one or more
 * variables declared outside this function
 * Case Study - 1 :
 * val multiplier = (i:Int) => i * 10
 *    Here the only variable used in the function body, i * 0, is i,
 *    which is defined as a parameter to the function
 * Example:
 * Case Study - 2 :
 * val multiplier = (i:Int) => i * factor
 *    There are two free variables in multiplier: i and factor. One of them,
 *    i, is a formal parameter to the function. Hence, it is bound to a new value
 *    each time multiplier is called. Now, factor has a reference to a variable outside
 *    the function but in the enclosing scope
 */
object VinayPrg1 {

  def main(args: Array[String]) {
    println("muliplier(1) value = " + muliplier(1))
    println("muliplier(2) value = " + muliplier(2))
  }

  var factor = 3
  val muliplier = (i: Int) => {
    factor = factor * 1 // any business logic
    i + factor
  }

}