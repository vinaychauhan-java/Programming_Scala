package com.vinay.scala.prg10.extractors
/**
 * Scala Program: Extractors
 * An extractor in Scala is an object that has a method called unapply as
 * one of its members. The purpose of that unapply method is to match a value
 * and take it apart. Often, the extractor object also defines a another
 * method apply for building values, but this is not required.
 *
 */

object VinayPrg1 {
  def main(args: Array[String]) {
    println("  Name : " + apply("Sachin", "Ramesh", "Tendulkar"))
    println("  Name : " + upapply("Sachin Ramesh Tendulkar"))

  }

  // The injection method (optional)
  def apply(firstName: String, middleName: String, lastName: String) = {
    println("Applying...");
    firstName + " " + middleName + " " + lastName
  }

  // The extraction method (mandatory)
  def upapply(completeName: String): Option[(String, String, String)] = {
    println("Un-Applying...");
    val values = completeName split " "
    if (values.length == 3) {
      scala.Some(values(0), values(1), values(2))
    } else {
      scala.None
    }
  }

}

/**
 * Brief Points :-
 * (1) This object defines both apply and unapply methods. The apply method has the 
 * same meaning as always: it turns VinayPrg1 into an object that can be applied to 
 * arguments in parentheses in the same way a method is applied.
 * (2) The unapply method is what turns VinayPrg1 class into an extractor and it 
 * reverses the construction process of apply. Where apply takes three strings and forms 
 * completeName string out of them, unapply takes completeName and returns potentially 
 * three strings: firstName, middleName, lastName
 * (3) The unapply must also handle the case where the given string is not a completeName. 
 * That's why unapply returns an Option-type over pairs of strings
 * 
 */
