package com.vinay.scala.prg1.basics
// package com.vinay.scala.prg1;
// Scala is a line-oriented language where statements may be terminated by semicolons (;) or newlines. 
// That's why it's the biggest syntactic difference between Scala and Java is that the ; line end character is optional. 

// Scala (short for Scalable Language) is a modern multi-paradigm programming language designed to express common programming patterns in a concise, elegant, and type-safe way. 
// Scala has been created by Martin Odersky and he released the first version in 2003.
// Therefore, Scala smoothly integrates features of object-oriented and functional languages and it is compiled to run on the Java Virtual Machine.

// When we consider a Scala program it can be defined as a collection of objects that communicate via invoking each others methods.
// Object - Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors - barking, eating. An object is an instance of a class.
// Class - A class can be defined as a template/blueprint that describes the behaviors/states that object of its type support.
// Methods - A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.
// Fields - Each object has its unique set of instant variables, which are called fields. An object's state is created by the values assigned to these fields.

// This is my first Scala program.  
// This will print 'Hello World' as the output

object HelloWorld {

  def main(args: Array[String]) {
    // Will print Hello World
    println("Hello World !!")
    println("Good Afternoon Team !! ");
  }

}

// Steps from command Prompt:-
// 1) Open a command prompt window and go o the directory where you saved the program file. Assume it is C:\>
// 2) Type 'scalac HelloWorld.scala' and press enter to compile your code. If there are no errors in your code the command prompt will take you to the next line.
// 3) Above command will generate a few class files in the current directory. One of them will be called HelloWorld.class. This is a bytecode which will run on Java Virtual Machine (JVM).
// 4) Now, type 'scala HelloWorld' to run your program.
// 5) You will be able to see 'Hello, World!' printed on the window.

// Tips about packages:-
// - A Scala package is a named module of code. The package declaration is the first non-comment line in the source file as follows:
// package com.vinay.scala.prg1
// - Scala packages can be imported so that they can be referenced in the current compilation scope. The following statement imports the contents of the scala.xml package:
// import scala.xml._
// - We can import a single class and object, for example, HashMap from the scala.collection.mutable package:
// import scala.collection.mutable.HashMap
// - We can import more than one class or object from a single package, for example, TreeMap and TreeSet from the scala.collection.immutable package:
// import scala.collection.immutable.{TreeMap, TreeSet}