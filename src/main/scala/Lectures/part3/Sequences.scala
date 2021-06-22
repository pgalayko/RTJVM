package Lectures.part3

import scala.util.Random

object Sequences extends App {

  // Seq
  val aSeq = Seq(1, 3, 2, 4)
  println(aSeq)
  println(aSeq.reverse)
  println(aSeq(2))
  println(aSeq ++ Seq(7, 5, 6))
  println(aSeq.sorted)

  // Ranges
  val aRange: Seq[Int] = 1 to 10 // "to" or "until"
  aRange.foreach(println)

  // Lists
  val aList = List(1, 2, 3)
  val prepended = 42 :: aList
  val prepended2 = 42 +: aList :+ 89
  println(prepended)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-|-"))

  // Arrays
  val numbers = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[Int](3)
//  println(threeElements)
  threeElements.foreach(println)

  // mutation
  numbers(2) = 0 // syntax sugar for numbers.update(2, 0)
  println(numbers.mkString(" "))

  // arrays and Seq
  val numbersSeq: Seq[Int] = numbers // implicit conversion
  println(numbersSeq)

  // Vectors
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)

  // vectors vs lists

  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), 0)
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  // keeps reference to tail
  // updating in the middle takes long
  println(getWriteTime(numbersList))
  // depth of the tree is small
  // need to replace an entire 32-element chunk
  println(getWriteTime(numbersVector))
}
