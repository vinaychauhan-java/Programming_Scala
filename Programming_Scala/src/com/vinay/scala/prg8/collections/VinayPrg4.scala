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
object VinayPrg4 {
  def main(args: Array[String]) {
    // Empty set of integer type
    // var mySet: Set[Int] = Set()
    // println(mySet); // Will Print : Set()

    // Set of String Type 
    var myFruits: Set[String] = Set("Apple", "Orange", "Mango")
    //var myFruits = Set("Apple", "Orange", "Mango")
    println(myFruits);
    myFruits = Set("Apple", "Orange", "Mango", "PineApple")
    println(myFruits);

    println("==================================================================")

    //Head :: This method returns the first element of a Set.
    println("Head of List :: " + myFruits.head)
    //Tail :: This method returns a Set consisting of all elements except the first.
    println("Tail of List :: " + myFruits.tail)
    //Init :: This method returns a Set consisting of all elements except the last.
    println("Tail of List :: " + myFruits.init)
    //isEmpty	:: This method returns true if the Set is empty otherwise false.
    println("Check elements for List :: " + myFruits.isEmpty)

    println("==================================================================")

    // We can use either ++ operator or Set.++() method to concatenate two or more sets, 
    // but while adding sets it will remove duplicate elements
    var anotherFruits: Set[String] = Set("Litchi", "WaterMelon", "Mango")
    var completeFruits = myFruits ++ anotherFruits
    println("Complete Fruits Set :- " + completeFruits) // Will Remove the Duplicate Element 
    completeFruits = myFruits.++(anotherFruits)
    println("Complete Fruits Set :- " + completeFruits) // Will Remove the Duplicate Element 

  }
}