package Lectures.part2

object OOPbasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")

  val author = new Writer("Pasha", "Galayko", 1998)
  val novel = new Novel("Hallo", 2021, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter(0)
  println(counter.inc)
}

// constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2

  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I'm $name")

  // multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}

class Writer(firstName: String, surname: String, val yearOfBirth: Int) {
  def fullName() = s"${firstName + surname}"
}

class Novel(name: String, yearOfRelease: Int, writer: Writer) {
  def authorAge = yearOfRelease - writer.yearOfBirth

  def isWrittenBy(author: Writer) = author == this.writer

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, writer)
}

class Counter(val count: Int) {
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count - 1)

//  def inc(n: Int) = {
//    if (n <= 0) this
//    else inc.inc(n - 1)
//  }
//
//  def dec(n: Int) = {
//    if (n <= 0) this
//    else dec.dec(n - 1)
//  }

}

// class parameters are NOT FIELDS
