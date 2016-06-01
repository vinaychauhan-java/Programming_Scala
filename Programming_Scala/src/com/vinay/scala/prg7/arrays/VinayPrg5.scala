package com.vinay.scala.prg7.arrays

import scala.Array.range
/**
 *  Scala Program: Arrays
 *  Following is the example, which makes use of range() method to generate an array
 *  containing a sequence of increasing integers in a given range. We can use final
 *  argument as step to create the sequence; if you do not use final argument,
 *  then step would be assumed as 1.
 */
object VinayPrg5 {
  def main(args: Array[String]) {
    var array1 = range(1, 10, 2)
    var array2 = range(1, 10)

    for (value <- array1) {
      print(value + " ");
    }

    println("\n=====================================")

    for (value <- array2) {
      print(value + " ");
    }
  }
}