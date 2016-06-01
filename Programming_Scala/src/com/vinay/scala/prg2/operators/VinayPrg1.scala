package com.vinay.scala.prg2.operators
/**
 * Scala Operators : Arithmetic
 *
 * Scala support following Arithmetic Operator:-
 * +, -, *, /, %
 */
object VinayPrg1 {
  def main(args: Array[String]) {
    var a: Int = 25;
    var b: Int = 5;
    println("Operation + : " + (a + b))
    println("Operation - : " + (a - b))
    println("Operation * : " + (a * b))
    println("Operation / : " + (a / b))
    println("Operation % : " + (a % b))
  }
}

/**
 * 
 * Operators Precedence in Scala :-
 * Multiplicative  	* / % 	Left to right 
 * Additive  	      + - 	  Left to right
 * 
 * For example x = 7 + 3 * 2; here, x is assigned 13, not 20 because operator * has higher 
 * precedence than +, so it first get multiplied with 3*2 and then adds into 7.
 * 
 * Note:- Operators with the highest precedence appear are listed first  whereas the lowest appear at the bottom. 
 * Within an expression, higher precedence operators will be evaluated first.
 * 
 */
 