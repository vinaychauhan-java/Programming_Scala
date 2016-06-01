package com.vinay.scala.prg3.functions
/**
 * Scala Functions :: Unit
 * A function, which does not return anything, can return Unit which is equivalent
 * to void in Java and indicates that function does not return anything.
 * The functions which do not return anything in Scala, they are called procedures.
 */

object VinayPrg2 {
  def main(args: Array[String]) {
    println("Welcome to Scala !!")
    greetingsMessage1()
    greetingsMessage2()
    greetingsMessage3()
  }

  def greetingsMessage1(): Unit = {
    println("Good Afternoon Vipin Sir :-)")
  }

  def greetingsMessage2() = {
    println("Good Afternoon Ananya Madam:-)")
  }

  def greetingsMessage3() {
    println("Good Afternoon :-)")
  }
}