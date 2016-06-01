package com.vinay.scala.prg11.exceptions

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
/**
 * Scala Program: Exceptions
 *
 * Scala doesn't actually have checked exceptions.
 *
 */

object vinayPrg2 {
  def main(args: Array[String]) {
    try {
      val fileReader = new FileReader("D:\\Data.txt")
      val bufferedReader = new BufferedReader(fileReader)
      println(bufferedReader.readLine())
    } catch {
      case exception: FileNotFoundException => println("Missing File Exception :: " + exception)
      case exception: IOException           => println("IO Exception")
      case _: Exception                     => println("Got some other kind of Exception")
    } finally {
      println("Exiting Finally... :-)")
    }
  }
}