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

object vinayPrg2 {
  def main(args: Array[String]) {

    //The type of a list that has elements of type T is written as List[T]
    val fruits: List[String] = List("Apple", "Orange", "Mango")
    println(fruits)

    // List of Integers
    val numbers: List[Int] = List(10, 20, 30, 40)
    println(numbers)

    // Empty List.
    val emptyList: List[Nothing] = List()
    println(emptyList)

    // Two dimensional List
    val twoDimList: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1))
    println(twoDimList)

    println("==================================================================")
    
    // All lists can be defined using two fundamental building blocks, a tail Nil 
    // and ::, which is pronounced cons. Nil also represents the empty list. 
    // All the above lists can be defined as follows:
    val anotherFruits = "Apple" :: ("Orange" :: ("Mango" :: Nil))
    println(anotherFruits)

    val anotherNumbers = 10 :: (20 :: (30 :: (40 :: Nil)))
    println(anotherNumbers)

    val anotherEmptyList = Nil
    println(anotherEmptyList)

    val anotherTwoDimList =
      (1 :: (0 :: (0 :: Nil))) ::
        (0 :: (1 :: (0 :: Nil))) ::
        (0 :: (0 :: (1 :: Nil))) :: Nil
    println(anotherTwoDimList)
  }
}