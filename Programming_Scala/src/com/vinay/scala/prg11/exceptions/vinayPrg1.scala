package com.vinay.scala.prg11.exceptions

import java.io.IOException
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.BufferedReader
/**
 * Scala Program: Exceptions
 *
 * Scala doesn't actually have checked exceptions.
 *
 */

object vinayPrg1 {
  def main(args: Array[String]) {
    try {
      val fileReader = new FileReader("D:\\Data-1.txt")
      val bufferedReader = new BufferedReader(fileReader)
      println(bufferedReader.readLine())
    } catch {
      case exception: FileNotFoundException => println("Missing File Exception")
      case exception: IOException           => println("IO Exception")
    }
  }
}