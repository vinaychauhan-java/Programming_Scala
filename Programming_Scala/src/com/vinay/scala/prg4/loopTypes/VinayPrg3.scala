package com.vinay.scala.prg4.loopTypes
/**
 *  Scala Program: do...while Loop
 *
 *  Syntax of a do...while loop in Scala is:
 *  do{
 *  	statement(s);
 *  }while( condition );
 *
 */
object VinayPrg3 {
  def main(args: Array[String]) {
    var i: Int = 1;
    do {
      print(i + " ")
      i += 1;
    } while (i <= 10)
  }
}