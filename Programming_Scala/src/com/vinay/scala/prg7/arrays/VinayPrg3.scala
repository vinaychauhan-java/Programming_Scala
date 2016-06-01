package com.vinay.scala.prg7.arrays

object VinayPrg3 {
  def main(args: Array[String]) {
    var myMatrix = Array.ofDim[Int](2, 2)
    myMatrix(0)(0) = 10
    myMatrix(0)(1) = 20
    myMatrix(1)(0) = 30
    myMatrix(1)(1) = 40

    for (i <- 0 to 1) {
      for (j <- 0 to 1) {
        print(myMatrix(i)(j) + " ")
      }
      println("");
    }

  }
}