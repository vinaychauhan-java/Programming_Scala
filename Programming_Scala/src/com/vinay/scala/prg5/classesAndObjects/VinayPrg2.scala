package com.vinay.scala.prg5.classesAndObjects
/**
 *  Scala Program: Class & Object
 *
 */
class A {
  def greetings() {
    println("Greetings from Class A")
  }
}

class B extends A {
  override def greetings() {
    println("Greetings from Class B")
  }
  
  def anotherGreetings() {
    println("Another Greetings from Class B")
  }
}

object VinayPrg2 {
  def main(args: Array[String]) {
    var myObject1 = new A()
    myObject1.greetings() //Greetings from Class A

    var myObject2 = new B()
    myObject2.greetings() //Greetings from Class B
    myObject2.anotherGreetings() //Another Greetings from Class B

    // Since, myObject1 is declared as var hence it could be reassigned otherwise compilation error will be thrown 
    myObject1 = myObject2
    myObject1.greetings() //Greetings from Class B
  }
}