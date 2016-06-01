package com.vinay.scala.prg11.exceptions
/**
 * Scala Program: Exceptions
 *
 * Scala doesn't actually have checked exceptions.
 *
 */

object vinayPrg3 {
  def main(args: Array[String]) {
    try {
      val myValue = 2 / 0
    } catch {
      case unknown => println("Got some other kind of Exception :: " + unknown)
      //case unknown => println("Got some other kind of Exception :: " + unknown.printStackTrace())
    } finally {
      println("Exiting Finally... :-)")
    }
  }
}