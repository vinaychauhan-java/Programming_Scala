package com.vinay.scala.prg2.operators
/**
 * Scala Operators : Logical
 *
 * Scala support following Logical Operator:-
 * &&, ||, !
 */
object VinayPrg3 {
  def main(args: Array[String]) {
    var a: Boolean = true;
    var b: Boolean = false;
    println("Operation && : " + (a && b))
    println("Operation || : " + (a || b))
    println("Operation !  : " + (!a))
  }
}

/**
 * 
 * Operators Precedence in Scala :-
 * Logical AND 	  && 	  Left to right 
 * Logical OR 	  || 	  Left to right 
 *
 * Note:- Operators with the highest precedence appear are listed first whereas the lowest appear at the bottom. 
 * Within an expression, higher precedence operators will be evaluated first.
 * 
 */