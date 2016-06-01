package com.vinay.scala.prg7.arrays

object VinayPrg2 {
  def main(args: Array[String]) {
    var myArray = Array(1.1, 2.2, 3.3, 4.4)
    for (i <- myArray) {
      print(i + "  ")
    }

    println("\n=====================================")

    for (i <- 0 to myArray.length - 1) {
      print(myArray(i) + "  ")
    }

    println("\n=====================================")

    var max = myArray(0)
    for (i <- 0 to myArray.length - 1) {
      if (max < myArray(i)) {
        max = myArray(i)
      }
    }
    print("Max No. : " + max)
  }
}