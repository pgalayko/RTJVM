package Lectures.part1

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffect(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunc(a: Int, b: Int): Int = a + b

    aSmallerFunc(n, n - 1)
  }

  def greeting(age: Int, name: String) =
    s"Hi! My name is $name. I'm $age years old"

  println(greeting(22, "Pavel"))

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(31))
  println(isPrime(37 * 18))
}
