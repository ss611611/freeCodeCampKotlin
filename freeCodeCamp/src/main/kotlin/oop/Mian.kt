package oop


fun main(args: Array<String>) {
    val user = User("Alex")
    val friend = User("John", "Smith")

    println("Name = ${user.name}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")
//    println("Name ${friend.name} ")
}

class User(var name: String, var lastName: String, var age: Int){

    constructor(name: String) : this(name, "LastName",0) {
        println("2nd")
    }

    constructor(name: String, lastName: String): this(name,lastName,0) {
        println("3rd")
    }
}

//class User(name: String, var lastName: String, var age: Int) {
//    var name: String
//
//    init {
//        if (name.lowercase().startsWith("a")) {
//            this.name = name
//        }else {
//            this.name = "User"
//            println("The name doesn't start with the letter 'a' or 'A'")
//        }
//    }
//
//}


//    val car1 = Car(" Tesla  ", "S Plaid", "Red", 4)
//
//    println("Name = ${car1.name} ")
//    println("Model = ${car1.model} ")
//    println("Color = ${car1.color} ")
//    println("Doors = ${car1.doors} ")
//
//    car1.move()
//    car1.stop()
//
//    val car2 = Car("Ford", "Mustang", "Blue", 2)
//    println("\n")
//    println("Name = ${car2.name} ")
//    println("Model = ${car2.model} ")
//    println("Color = ${car2.color} ")
//    println("Doors = ${car2.doors} ")
//
//    car2.move()
//    car2.stop()


