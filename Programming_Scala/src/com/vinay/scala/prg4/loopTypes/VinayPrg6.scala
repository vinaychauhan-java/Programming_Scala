package com.vinay.scala.prg4.loopTypes

object VinayPrg6 {
  def main(args: Array[String]) {
    var myValue = "theValue";
    // var myValue = "anotherValue";
    // if default case is not handled then following exception will be thrown
    //   Exception in thread "main" scala.MatchError: theValue1 (of class java.lang.String)
    //   at com.vinay.scala.prg4.loopTypes.VinayPrg6$.main(VinayPrg6.scala:7)
    //   at com.vinay.scala.prg4.loopTypes.VinayPrg6.main(VinayPrg6.scala)

    myValue match {
      case "someValue"   => println(myValue + " :: Computed")
      case "thisValue"   => println(myValue + " :: Computed")
      case "theValue"    => println(myValue + " :: Computed")
      case "doubleValue" => println(myValue + " :: Computed")
      case _             => println("Not Processed")
    }

    //Match Expressions can return a Value :-)s
    myValue = "thisValue"
    val valueResult = myValue match {
      case "someValue"   => myValue + " :: Computed"
      case "thisValue"   => myValue + " :: Computed"
      case "theValue"    => myValue + " :: Computed"
      case "doubleValue" => myValue + " :: Computed"
      case _             => "Not Processed"
    }
    Console.println(valueResult)
  }
}