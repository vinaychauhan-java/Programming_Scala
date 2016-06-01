package com.vinay.scala.prg8.collections

/**
 * Scala Program: Collections
 *
 * Scala has a rich set of collection library. Collections are containers of things.
 * Those containers can be sequenced, linear sets of items like List, Tuple, Option, Map, etc.
 * The collections may have an arbitrary number of elements or be bounded to zero or one element
 *
 * Collections may be strict or lazy. Lazy collections have elements that may not consume
 * memory until they are accessed, like Ranges. Additionally, collections may be mutable
 * (the contents of the reference can change) or immutable (the thing that a reference
 * refers to is never changed). Note that immutable collections may contain mutable items.
 *
 * For some problems, mutable collections work better, and for others, immutable collections
 * work better. When in doubt, it is better to start with an immutable collection
 * and change it later if you need mutable ones.
 */

object vinayPrg1 {
  def main(args: Array[String]) {
    // Define a List
    val list = List(10, 20, 30, 40, 50)
    println(list)

    // Define a set.
    var set = Set("Apple", "Orange", "Mango")
    println(set)

    // Define a map.
    val map = Map("Key-One" -> "Value-1", "Key-Two" -> "Value-2", "Key-Three" -> "Value-3")
    println(map)

    // Create a Tuple of two elements.
    val tuple = (10, "Scala")
    println(tuple)

    // Define an Option
    val option: Option[Int] = Some(5)
    println(option)

  }
}