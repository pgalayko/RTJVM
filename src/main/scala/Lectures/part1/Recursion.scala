package Lectures.part1

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computing factorial of " + n )

      result
    }
  }
  println(factorial(10))

  def anotherfactorial(n: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // Tail recursive = use recursive call as the  LAST expression

      factorialHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factorialHelper(10, 1)
  = factorialHelper(9, 10 * 1)
  = factorialHelper(8, 9 * 10 * 1)
  = factorialHelper(7, 8 * 9 * 10 * 1)
  = factorialHelper....
  = factorialHelper(2, 3 * 4 * ... * 10 * 1)
  = factorialHelper(1, 1 * 2 * ... * 10)
  = 1 * 2 * 3 * 4 * ... * 10
   */
  anotherfactorial(5000)

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  def concatenate(str: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else concatenate(str, n-1, str + acc)
  }
  println(concatenate("Hello", 4, ""))

  def isPrime(n: Int):Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

      isPrimeTailrec(n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int =  {
    def fiboTailrec(i: Int, last: Int, nextLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextLast, last)

      if (n <= 2) 1
      else fiboTailrec(2, 1, 1)

  }
  println(8)
}

