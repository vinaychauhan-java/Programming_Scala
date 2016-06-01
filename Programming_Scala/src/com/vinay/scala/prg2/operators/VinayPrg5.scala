package com.vinay.scala.prg2.operators
/**
 * Scala Operators : Bitwise
 *
 * Assume if A = 60; and B = 13; now in binary format they will be as follows:
 * A = 0011 1100
 * B = 0000 1101
 * -----------------
 * A&B = 0000 1100
 * A|B = 0011 1101
 * A^B = 0011 0001
 * ~A  = 1100 0011
 *
 * Scala support following Bitwise Operator:-
 * &	Binary AND Operator copies a bit to the result if it exists in both operands.	(A & B) will give 12, which is 0000 1100
 * |	Binary OR Operator copies a bit if it exists in either operand.	(A | B) will give 61, which is 0011 1101
 * ^	Binary XOR Operator copies the bit if it is set in one operand but not both.	(A ^ B) will give 49, which is 0011 0001
 * ~	Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.	(~A ) will give -61, which is 1100 0011 in 2's complement form due to a signed binary number.
 * <<	Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.	A << 2 will give 240, which is 1111 0000
 * >>	Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.	A >> 2 will give 15, which is 1111
 * >>>	Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.	A >>>2 will give 15 which is 0000 1111
 */
object VinayPrg5 {
  def main(args: Array[String]) {
    var a: Int = 60;
    var b: Int = 13;
    println("Operation & " + (a & b))
  }
}


/**
 * 
 * Operators Precedence in Scala :-
 * Shift  	    >> >>> <<  	Left to right
 * Bitwise AND 	& 	        Left to right 
 * Bitwise XOR 	^ 	        Left to right 
 * Bitwise OR 	| 	        Left to right 
 *
 * Note:- Operators with the highest precedence appear are listed first whereas the lowest appear at the bottom. 
 * Within an expression, higher precedence operators will be evaluated first.
 * 
 */