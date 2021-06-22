package Lectures.part2

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit
  }

    // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahaha")
  }
    /*
      equivalent with

      class AnonumousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("ahahahaha")
    }
    val funnyAnimal: Animal = new AnonumousClasses$$anon$1
      */
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi! My name is $name")
  }
  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi! My name is Jim, what's up?")
  }
}
