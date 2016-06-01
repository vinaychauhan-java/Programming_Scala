package com.vinay.scala.prg5.classesAndObjects

/**
 * The main/primary constructor is defined when we define our class.
 */
class Person(val firstName: String, val lastName: String, val age: Int) {

  /**
   * A secondary constructor.
   */
  def this(firstName: String) {
    this(firstName, "", 0);
    println("\nNo last name or age given.")
  }

  /**
   * Another secondary constructor.
   */
  def this(firstName: String, lastName: String) {
    this(firstName, lastName, 0);
    println("\nNo age given.")
  }

  override def toString: String = {
    return "%s %s, Age : %d".format(firstName, lastName, age)
  }

}
object VinayPrg4 {
  def main(args: Array[String]) {
    // (1) use the primary constructor
    val person1 = new Person("Vipin", "Chauhan", 35)
    println(person1)

    // (2) use a secondary constructor
    val person2 = new Person("Vinay", "Chauhan")
    println(person2)

    // (3) use a secondary constructor
    val person3 = new Person("Ananya")
    println(person3)

  }
}