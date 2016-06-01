package com.vinay.scala.prg2.operators
/**
 * Scala Operators : Assignment
 *
 * Scala support following Assignment Operator:-
 * =, +=, -=, *=, /=, %=
 * <<= (Left shift AND assignment operator)
 * >>= (Right shift AND assignment operator)
 * = & (Bitwise AND assignment operator)
 * ^=	 (Bitwise exclusive OR and assignment operator)
 * |=	 (Bitwise inclusive OR and assignment operator)
 */
object VinayPrg4 {
  def main(args: Array[String]) {
    var a: Int = 25;
    var b: Int = 5;
    a += b
    println("Operation += " + (a))
  }
}

/**
 * 
 * Operators Precedence in Scala :-
 * Assignment 	= += -= *= /= %= >>= <<= &= ^= |= 	Right to left
 *
 * Note:- Operators with the highest precedence appear are listed first whereas the lowest appear at the bottom. 
 * Within an expression, higher precedence operators will be evaluated first.
 * 
 */