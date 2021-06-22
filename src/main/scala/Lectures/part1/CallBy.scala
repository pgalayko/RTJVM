//package Lectures.part1
//
//object CallBy extends App {
//  def calledByValue(x: Long): Unit = {
//    println("by value: " + x)
//    println("by value: " + x)
//  }
//
//  def calledByName(x: => Long): Unit = {
//    println("by name: " + x)
//    println("by name: " + x)
//  }
//
//  calledByName(System.nanoTime())
//  calledByValue(System.nanoTime())
//
////  def infinite(): Unit = 1 + infinite()
////  def printFirst(x: Int, y: => Int): Unit = println(x)
////
//////  printFirst(infinite(), 34)
//////  printFirst(34, infinite())
////}
