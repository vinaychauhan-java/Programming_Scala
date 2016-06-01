package com.vinay.scala.prg7.arrays
/**
 *  Scala Program: Arrays
 *  Scala provides a data structure, the array, which stores a fixed-size sequential
 *  collection of elements of the same type. An array is used to store a collection
 *  of data, but it is often more useful to think of an array as a collection of
 *  variables of the same type.
 */
object VinayPrg1 {
  def main(args: Array[String]) {
    // Case-1 : Implementation
    // var myArray1: Array[String] = new Array(3)
    // Case-2 : Implementation
    var myArray1 = new Array[String](3)
    myArray1(0) = "Mango"
    myArray1(1) = "Orange"
    myArray1(4 / 2) = "Apple" //Index can be any expression that yields a whole number
    for (i <- 0 to 2) {
      print(" " + myArray1(i))
    }

    println("\n=====================================")

    var myArray2 = Array("Mango", "Orange", "Apple")
    for (i <- 0 to 2) {
      print(" " + myArray1(i))
    }

  }
}