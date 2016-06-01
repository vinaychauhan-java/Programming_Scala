package com.vinay.scala.prg3.functions
/**
 * Scala Functions :: Variable Arguments
 * Scala allows us to indicate that the last parameter to a function may be repeated.
 * This allows clients to pass variable length argument lists to the function
 */

object VinayPrg5 {
  def main(args: Array[String]) {
    printFruitNames("Apple", "Banana", "Orange", "PineApple")
  }

  def printFruitNames(fruitValues: String*) = {
    var i: Int = 0;
    println("Fruit Values Object :: "+fruitValues)
    // Look For Sign/Sybmol "<-"
    for (fruit <- fruitValues) {
      println("Fruit [" + i + "] = " + fruit);
      i = i + 1;
    }
  }
}