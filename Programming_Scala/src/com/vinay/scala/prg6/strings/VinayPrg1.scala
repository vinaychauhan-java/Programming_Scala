package com.vinay.scala.prg6.strings
/**
 *  Scala Program: Strings
 */
object VinayPrg1 {
  // Here, the type of the value above is java.lang.String borrowed from Java
  // because Scala strings are also Java strings
  val message1: String = "Good Afternoon !! "
  val message2: String = "Vipin Sir"

  def main(args: Array[String]) {
    println(message1)

    println("Length Function       : " + message1.length())
    // Methods used to obtain information about an object are 
    // known as accessor methods. e.g. message1.length()

    println("Concatenate Function  : " + message1.concat(message2))
    
    println("Concatenate Function  : " + message1.concat(message2))
    
    println("Chat-At Function      : " + message1.charAt(3))
    
    println("ContentEquals Function: " + message2.contentEquals("Vipin Sir"))
    
    println("Uppen Function        : " + message2.toUpperCase())
    
  }

}

/**
 * In Scala, as in Java, a string is an immutable object, that is, an object that 
 * cannot be modified. On the other hand, objects that can be modified, like arrays, 
 * are called mutable objects.
 */
