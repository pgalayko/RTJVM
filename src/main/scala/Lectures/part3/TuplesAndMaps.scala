//package Lectures.part3
//
//object TuplesAndMaps extends App {
//
//  // tuples = finite ordered "lists"
//  val aTuple = (2, "Hello, Scala") // Tuple2[Int, String] = (Int, String)
//
//  println(aTuple._1)
//  println(aTuple.copy(_2 = "goodbye Java"))
//  println(aTuple.swap) // ("Hello, Scala", 2)
//
//  // Maps - keys -> values
//  val aMap: Map[String, Int] = Map()
//
//  val phoneBook = Map(("Jim", 555), "Daniel" -> 785, ("JIM", 555)).withDefaultValue(-1)
//  // a -> b is a sugar for (a,b)
//  println(phoneBook)
//
//  // Map operations
//  println(phoneBook.contains("Jim"))
//  println(phoneBook("Jim"))
//  println(phoneBook("Mary"))
//
//  // add a pairing
//  val newPairing = "Mary -> 678"
//  val newPhoneBook = phoneBook + newPairing
//  println(newPhoneBook)
//
//  // functionals on Maps
//  // map, flatmap, filter
//
//  println(phoneBook.map(pair => pair._1.toLowerCase -> pair._2))
//
//  // filterKeys
//  println(phoneBook.filterKeys(x => x.startsWith("J")))
//  // mapValues
//  println(phoneBook.mapValues(number => "0245-" + number ))
//
//  // conversins to other collections
//  println(phoneBook.toList)
//  println(List(("Daniel", 555)).toMap)
//  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
//  println(names.groupBy(name => name.charAt(0)))
//
//  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] =
//    network + (person -> Set())
//
//  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
//    val friendsA = network(a)
//    val friendsB = network(b)
//
//    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
//  }
//
//  def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
//    val friendsA = network(a)
//    val friendsB = network(b)
//
//    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
//  }
//
//  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
//    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] =
//      if (friends.isEmpty) networkAcc
//      else removeAux(friends.tail, unfriend((networkAcc, person, friends.head)))
//
//    val unfriended = removeAux(network(person), network)
//    unfriended - person
//  }
//
//  val empty: Map[String, Set[String]] = Map()
//  val network = add(add(empty, "Bob"), "Mary")
//  println(network)
//  println(friend(network, "Bob", "Mary"))
////  println(unfriend(friend(network, "Bob", "Mary"), "Bob", "Mary"))
//  println(remove(friend(network, "Bob", "Mary"), " Bob"))
//
//  // Jim, Bob, Mary
//  val people = add(add(add(empty, "Bob"), "Mary"), "Jim")
//  val jimBob = friend(people, "Bob", "Jim")
//  val testNet = friend(jimBob, "Bob", "Mary")
//
//  println(testNet)
//}
//
