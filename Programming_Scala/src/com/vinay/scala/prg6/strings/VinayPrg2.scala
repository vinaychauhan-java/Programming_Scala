package com.vinay.scala.prg6.strings
/**
 *  Scala Program: Strings
 */
object VinayPrg2 {
  var message1: StringBuilder = new StringBuilder("Good Afternoon")

  def main(args: Array[String]) {
    println(message1)

    println("Length Function       : " + message1.length())
    // Methods used to obtain information about an object are 
    // known as accessor methods. e.g. greetings.length()

    println("Appebd Function       : " + message1.append(" :: Vinay"))
    
    println("Reverse Function      : " + message1.reverse)

  }

}
