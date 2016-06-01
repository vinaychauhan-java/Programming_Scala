package com.vinay.scala.prg10.extractors
/**
 * Scala Program: Extractors
 * 
 * When an instance of a class is followed by parentheses with a list of zero
 * or more parameters, the compiler invokes the apply method on that instance.
 * We can define apply both in objects and in classes.
 *
 */
class MyClass(pValue: Int) {
  var value: Int = pValue

  def apply(myValure: Int): Int = {
    myValure * 5
  }

  def getValue(): Int = {
    value
  }
}

object VinayPrg2 {
  def apply(myValure: Int) = {
    myValure * 5
  }

  def main(args: Array[String]) {
    var value = VinayPrg2(2)
    println("main >> apply >> Value : " + value)

    var myObject = new MyClass(101)
    println("myClass >> myObject >> Value : " + myObject.getValue())
    println("myClass >> myObject >> apply >> Value : " + myObject(2))

  }
}