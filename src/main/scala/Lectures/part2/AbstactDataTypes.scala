package Lectures.part2

object AbstactDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Wild"

    def eat: Unit = println("crunch")
  }

  // traits
  trait ColdBlooded
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meal"
  }
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behavior, abstract class = "thing"
}
