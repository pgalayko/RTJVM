package Lectures.part1

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)

  println(1 == x) //false
  // == !=(non equal) > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 //side effect

  // Instructions (DO) vs Expressions (VALUE)

  // if expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val aWeirdValue: Unit = (aVariable = 3)
  println(aWeirdValue)

  // side effects: print, whiles, reassigning

  // Code Blocks

  val aCodeBlick = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }


}
