package Lectures.part3

object WhatsAFunction extends App {
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2

  }
  // function types = Function1[A, B]
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }
  println(doubler(2))
  println(stringToIntConverter("3") + 4)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }

  // Function types Function2[A, B, R] === (A,B) => R

  // ALL SCALA FUNCTIONS ARE OBJECTS

  def concatenator: (String, String) => String =
    new Function2[String, String, String] {
      override def apply(a: String, b: String): String = a + b
    }
  println(concatenator("Hello", "Scala"))

  // Function1[Int, Function1[Int, Int]]
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] =
      new Function1[Int, Int] {
        override def apply(y: Int): Int = x + y
      }
  }

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) // curried function

}

trait MyFunction[A, B] {
  def apply(element: A): B
}
