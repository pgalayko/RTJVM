package Lectures.part2

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck?" // после ! стоит пробел, чтобы компилятор не счёл : частью имени метода
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply():String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is leanring $thing"
    def learnsScala = this learns "Scala"
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")

  //"operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)

  //prefix notation
  val x = -1
  val y = 1.unary_- // same
  // unary works with - + ~ !

  println(!mary)
  println(mary.unary_!) // Same

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary())

  // Exercises
println((mary + "the Rockstar")())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))
}
