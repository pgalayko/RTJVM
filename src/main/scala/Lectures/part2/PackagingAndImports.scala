package Lectures.part2

import Homework.PrinceCharming

object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Daniel", "", 2018)

  // import the package
  // val smth = new *path*.*method name*

  // packages are in hierarchy
  // matching folder structure

  // package object
  sayHello

  // imports
  val prince = new PrinceCharming

  // default imports
  // java.lang - String, Object, Exception
  // scala - Int, Nothing, Function
}
