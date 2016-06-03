package com.vinay.scala.prg8.collections
/**
 * Scala Program: Collections >> Set
 *
 * Scala Set is a collection that contains no duplicate elements.
 * There are two kinds of Sets :-
 * (1) Immutable
 * (2) Mutable
 * The difference between mutable and immutable objects is that when
 * an object is immutable, the object itself can't be changed.
 *
 *  By default, Scala uses the immutable Set. If we want to use the Mutable
 *  Set then we have to import scala.collection.mutable.Set class explicitly.
 *
 *  If we want to use both mutable and immutable sets in the same, then you can continue
 *  to refer to the immutable Set as Set but we can refer to the mutable Set as mutable.Set.
 *
 */
object VinayPrg5 {
  def main(args: Array[String]) {

    // Iterating over the Fruit Set
    var myFruits: Set[String] = Set("Apple", "Orange", "Mango", "PineApple")
    var anotherFruits: Set[String] = Set("Litchi", "WaterMelon", "Mango")
    var completeFruits = myFruits ++ anotherFruits
    var i: Int = 1;
    completeFruits.foreach { fruit => print("(" + i + ") "); println(fruit); i = i + 1; }

    println("\n==================================================================")
    // we can use either Set.& method or Set.intersect method to 
    // find out the common values between two sets
    println("Common value beween two Sets : " + myFruits.&(anotherFruits))
    println("Common value beween two Sets : " + myFruits.intersect(anotherFruits))

    println("\n==================================================================")

    var myNumSet: Set[Int] = Set(10, 20, 30, 40, 50)
    println("Minimum Number is :" + myNumSet.min)
    println("Maximim Number is :" + myNumSet.max)
    println("Set Count is      :" + myNumSet.size)
  }
}