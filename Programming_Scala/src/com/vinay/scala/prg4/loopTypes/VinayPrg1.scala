package com.vinay.scala.prg4.loopTypes
/**
 *  Scala Program: If..Else
 */
object VinayPrg1 {
  def main(args: Array[String]) {
    var a: Int = 25;
    var b: Int = 10;
    var c: Int = 15;

    if (a > b) {
      println("A is greater")
    } else {
      println("B is greater")
    }

    if (a > b && a > c) {
      println("A is greater")
    } else if (b > c) {
      println("B is greater")
    } else {
      println("C is greater")
    }
  }
}