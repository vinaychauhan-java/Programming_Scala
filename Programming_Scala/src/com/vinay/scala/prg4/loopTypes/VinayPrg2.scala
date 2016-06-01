package com.vinay.scala.prg4.loopTypes
/**
 *  Scala Program: For Loop
 *
 *  For Loop Syntax:-
 *  for( var x <- Range ){
 *  	  statement(s);
 *  }
 *  Note:- The left-arrow <- operator is called a Generator,
 *  so named because it's generating individual values from a range
 *
 * }
 */
object VinayPrg2 {
  def main(args: Array[String]) {

    println("Simple Loop");
    for (i <- 1 to 5) {
      print(i + " ")
    }

    println("\n\nAnother Simple Loop");
    for (i <- 1 until 5) {
      print(i + " ")
    }

    println("\n\nNested Loop");
    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print(j)
      }
      print(" ")
    }

    println("\n\nLoop with Mupltiple Ranges");
    for (i <- 1 to 5; j <- 1 to i) {
      print(j)
    }

    println("\n\nLoop with Collections");
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    for (num <- numList) {
      print(num + " ")
    }

    println("\n\nLoop with Collections & filters : Case-A");
    for (num <- numList if num != 3; if num > 8) {
      print(num + " ")
    }

    println("\n\nLoop with Collections & filters : Case-B");
    for (num <- numList if (num != 3 && num > 8)) {
      print(num + " ")
    }

    println("\n\nLoop with Collections & Yield : : Case-A");
    var myNumbers = 0;
    //We can store return values from a for loop in a variable or can return through a function
    var retVal = for { myNumbers <- numList if (myNumbers != 3 && myNumbers > 8) } yield myNumbers
    for (num <- retVal) {
      print(num + " ")
    }

    println("\n\nLoop with Collections & Yield : : Case-B");
    def getNumbers() = for { myNumbers <- numList if (myNumbers != 3 && myNumbers > 8) } yield myNumbers
    for (num <- getNumbers()) {
      print(num + " ")
    }
  }
}