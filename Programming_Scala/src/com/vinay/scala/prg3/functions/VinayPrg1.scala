package com.vinay.scala.prg3.functions
/**
 * Scala Functions :: By-Value
 * Scala has both functions and methods and we use the terms method and function
 * interchangeably with a minor difference. A Scala method is a part of a class which
 * has a name, a signature, optionally some annotations, and some bytecode where as a
 * function in Scala is a complete object which can be assigned to a variable.
 * In other words, a function, which is defined as a member of some object, is called a method.
 *
 * A function definition can appear anywhere in a source file and Scala permits nested function definitions,
 * that is, function definitions inside other function definitions.
 * Most important point to note is that Scala function's name can have characters like +, ++, ~, &,-, -- , \, /, : etc.
 */

object VinayPrg1 {
  def main(args: Array[String]) {
    println("Sum of Two Numbers : " + sum(10, 20))
    println("Subtraction of Two Numbers : " + sub(20, 10))
    println("Multiplication of Two Numbers : " + multiply(10, 10))
  }

  def sum(firstValue: Int, secondValue: Int): Int = {
    var totalValue = firstValue + secondValue
    totalValue // Writing return is optional in Scala
  }

  def sub(firstValue: Int, secondValue: Int): Int = {
    var totalValue = firstValue - secondValue
    return totalValue
  }

  def multiply(firstValue: Int, secondValue: Int) = firstValue * secondValue

}

/**
 * Other Useful Notes:-
 * Function Declarations:-
   A scala function declaration has the following form:
      def functionName ([list of parameters]) : [return type]
   Methods are implicitly declared abstract if you leave off the equals sign and method body. 
   The enclosing type is then itself abstract.

 * Function Definitions:-
   A scala function definition has the following form:
      def functionName ([list of parameters]) : [return type] = {
         function body
         return [expr]
      }
   Here, return type could be any valid scala data type and list of parameters will be a list 
   of variables separated by comma and list of parameters and return type are optional.
   Very similar to Java, a return statement can be used along with an expression in case 
   function returns a value.
 * 
 */
