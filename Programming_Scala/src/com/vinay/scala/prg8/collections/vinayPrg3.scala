package com.vinay.scala.prg8.collections

/**
 * Scala Program: Collections >> List
 *
 * Scala Lists are quite similar to arrays which means, all the elements of a list
 * have the same type but there are two important differences. First, lists are immutable,
 * which means elements of a list cannot be changed by assignment.
 * Second, lists represent a linked list whereas arrays are flat.
 *
 */

object vinayPrg3 {
  def main(args: Array[String]) {

    //The type of a list that has elements of type T is written as List[T]
    val fruits: List[String] = List("Apple", "Orange", "Mango")
    //Head :: 	This method returns the first element of a list.
    println("Head of List :: " + fruits.head)
    //Tail :: This method returns a list consisting of all elements except the first.
    println("Tail of List :: " + fruits.tail)
    //isEmpty	:: This method returns true if the list is empty otherwise false.
    println("Check elements for List :: " + fruits.isEmpty)
    //reverse :: This method is used to reverse all elements of the list
    println("Reverse Element List :: " + fruits.reverse)

    println("==================================================================")

    val anotherFruits: List[String] = List("Litchi", "Pine-Apple")
    // use two or more lists with ::: operator
    var completeFruits = fruits ::: anotherFruits
    println("Complete Fruits List :- " + completeFruits)
    completeFruits = List.concat(fruits, anotherFruits)
    println("Complete Fruits List :- " + completeFruits)

    println("==================================================================")

    val carList = List.fill(3)("Tata-Bolt") // Repeats Value three times.
    println(carList)

  }
}