package Lectures.part2

object CaseClass extends App{

  /*
  equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim.toString)

  // 3. equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. CCs have copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs hane companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extracor patterns = CCs can be used in PATTERN MATHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
}
