package com.vinay.scala.prg4.loopTypes

import scala.util.control._
//import scala.util.control.Breaks

/**
 * Scala Program: For Loop with Break
 * As such there is no built-in break statement available in Scala but if we are running Scala version 2.8,
 * then there is a way to use break statement. When the break statement is encountered inside a loop, the
 * loop is immediately terminated and program control resumes at the next statement following the loop.
 */

object VinayPrg5 {
  def main(args: Array[String]) {
    val loop = new Breaks;
    loop.breakable {
      for (i <- 1 to 10) {
        print(i + " ")
        if (i == 5) {
          loop.break;
        }
      }
    }
    println("\nAfter the For Loop :-)");
  }
}