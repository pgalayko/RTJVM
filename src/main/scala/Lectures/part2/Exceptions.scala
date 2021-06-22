package Lectures.part2

object Exceptions extends App {

  val x: String = null
//  println(x.length)
  // this ^^ will crash with a NPE

  // throwing and catching exceptions

//  val aWeirdValue: String = throw new NullPointerException

  // throwable classes extend the Throwable class
  // Exception and Error are the major Throwable subtypes

  // 2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int 4 u")
    else 42

  val potentialFail =
    try {
      // code that might throw
      getInt(true)
    } catch {
      case e: RuntimeException => 43
    } finally {
      // code that will get executed NO MATTER WHAT
      // optional
      //does not influence the return type of this expressions
      // ise finally only for side effects
      println("finally")
    }

  println(potentialFail)

  // 3. how to define your own exceptions
  class MyExceptions extends Exception
  val exception = new MyExceptions

//  throw exception

//  val array = Array.ofDim(Int.MaxValue) // out of memory exception

  // stackoverflow exception
//  def infinite: Int = 1 + infinite
//  val noLimit = infinite

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val result = x + y

      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int) = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int) = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }
//  println(PocketCalculator.add(Int.MaxValue, 10))
  println(PocketCalculator.divide(2, 0))
}
