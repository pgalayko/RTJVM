package Lectures.part2

object Inheritance extends App {

  // single class inheritance
  sealed class Animal {
    val creatureType = "Wild"

    def eat = println("nomnomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //    override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

  //  class Dog(dogType: String) extends Animal {
  //    override val creatureType: String = dogType
  //  }
  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // super

  // preventing overrides
  // 1 - use final on members
  // 2 - use final on superclass
  // 3 - seal the class = extend classes in THIS FIE, prevent extention in other files
}
