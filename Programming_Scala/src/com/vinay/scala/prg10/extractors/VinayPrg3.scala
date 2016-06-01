package com.vinay.scala.prg10.extractors
/**
 * Scala Program: Pattern Matching with Extractors
 *
 * When an instance of a class is followed by parentheses with a list of zero
 * or more parameters, the compiler invokes the apply method on that instance.
 * We can define apply both in objects and in classes.
 */

// Following code defines an extractor object Twice
object Twice {
  def apply(myValure: Int) = myValure * 2
  def unapply(myValure: Int): Option[(Int)] = if (myValure % 2 == 0) Some(myValure / 2) else None
}

object VinayPrg3 {
  def main(args: Array[String]) {
    val value = Twice(4)
    println("main >> apply >> Value : " + value)

    // The purpose of the unapply method is to extract a specific value we are 
    // looking for. It does the opposite operation apply does. When comparing an 
    // extractor object using the match statement the unapply method will be 
    // automatically executed as shown below

    // The pattern case Twice(n) will cause an invocation of Twice.unapply, which 
    // is used to match even number; the return value of the unapply signals whether 
    // the argument has matched or not, and any sub-values that can be used for 
    // further matching. Here, the sub-value is myValure/2
    value match {
      case Twice(num) => println(value + " is bigger two times than " + num)
      case _          => println("Not Calculated")
    }

  }

}