package com.vinay.scala.prg7.arrays

import scala.Array.concat
/**
 *  Scala Program: Arrays
 *  Following is the example which makes use of concat() method to concatenate two arrays
 */
object VinayPrg4 {
  def main(args: Array[String]) {
    var array1 = Array(1, 2, 3, 4, 5)
    var array2 = Array(6, 7, 8, 9, 10)
    var array3 = concat(array1, array2)
    for (value <- array3) {
      print(value + " ");
    }

  }
}