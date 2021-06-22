package Lectures.part3

object AnonymousFunctions extends App {

//  val doubler = new Function[Int, Int] {
//    override def apply(x: Int): Int = x * 2

  // anonymous function (LAMBDA)
  val doubler: Int => Int = x => x * 2

  // multiple params in a lambda
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no param
  val doSmth: () => Int = () => 3

  // careful
  println(doSmth) // function itself
  println(doSmth()) // call

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // (a,b_ => a + b

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
