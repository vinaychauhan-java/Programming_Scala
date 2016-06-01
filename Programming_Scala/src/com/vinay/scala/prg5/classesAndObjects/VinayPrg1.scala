package com.vinay.scala.prg5.classesAndObjects
/**
 *  Scala Program: Class & Object
 *
 * A class is a blueprint for objects. Once you define a class, you can create objects
 * from the class blueprint with the keyword new.
 *
 */

// In Scala, class name works as a class constructor which can take a number of parameters.
class Fruit(pFruitName: String, pFruitTaste: String) {
  private var fruitName: String = pFruitName
  private var fruitTaste: String = pFruitTaste

  def getMessage(): String = {
    "Fruit : " + fruitName + " @ Taste : " + fruitTaste
  }
}

// Scala is more object-oriented than Java because in Scala we cannot have static members.
// Instead, Scala has singleton objects. A singleton is a class that can have only one
// instance, i.e., object. You create singleton using the keyword object instead of class keyword. 
// Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor
object VinayPrg1 {
  def main(args: Array[String]) {
    val myFruit1 = new Fruit("Apple", "Sweet")
    println(myFruit1.getMessage())
    val myFruit2 = new Fruit("Orange", "Khatta-Meetha")
    println(myFruit2.getMessage())
  }
}