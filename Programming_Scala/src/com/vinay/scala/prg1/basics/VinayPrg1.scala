package com.vinay.scala.prg1.basics

object VinayPrg1 {
  def main(args: Array[String]) {
   
    // Variable Declaration Syntax : var or val VariableName : DataType [= Initial Value] 
    
    //It is a variable that can change value and this is called mutable variable
    var message1: String = "Greetings Message :: 1 :: ";
    message1 = message1 + "Hurrah !!";
    println(message1);

    //It is a variable that can not be changed and this is called immutable variable
    val message2: String = "Greetings Message :: 2 :: "
    // Given below line will not execute because it'a immutable variable 
    // message2 = message2 + "Hurrah !!" 
    println(message2)

  }
}
