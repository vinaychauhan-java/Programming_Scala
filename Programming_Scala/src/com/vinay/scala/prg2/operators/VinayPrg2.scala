package com.vinay.scala.prg2.operators
/**
 * Scala Operators : Relational
 *
 * Scala support following Relational Operator:-
 * ==, !=, >, <, >=, <=,
 */
object VinayPrg2 {
  def main(args: Array[String]) {
    var a: Int = 25;
    var b: Int = 5;
    println("Operation == : " + (a == b))
    println("Operation != : " + (a != b))
    println("Operation >  : " + (a > b))
    println("Operation <  : " + (a < b))
    println("Operation >= : " + (a >= b))
    println("Operation <= : " + (a <= b))
  }
}

/**
 * 
 * Operators Precedence in Scala :-
 * Relational  	> >= < <=  	Left to right 
 * Equality  	  == != 	    Left to right 
 * 
* 
 * Note:- Operators with the highest precedence appear are listed first whereas the lowest appear at the bottom. 
 * Within an expression, higher precedence operators will be evaluated first.
 * 
 */
