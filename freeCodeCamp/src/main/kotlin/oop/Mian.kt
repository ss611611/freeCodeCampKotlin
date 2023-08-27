package oop


fun main(args: Array<String>) {
    val direction = Direction.valueOf("east".uppercase())

    when(direction) {
        Direction.EAST -> {
            println("The direction is EAST")
        }
        Direction.WEST -> println("The direction is WEST")
        Direction.NORTH -> println("The direction is NORTH")
        Direction.SOUTH -> println("The direction is SOUTH")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north",10),
    SOUTH("south",20),
    EAST("east",15),
    WEST("west",40);

    fun printData() {
        println("Direction =$direction and Distance =$distance")
    }
}


/*
OOP: Lazy Initialization
 */

//fun main(args: Array<String>) {
//    val user1 = User("Alex","Dobbin",23)
//    val user2 by lazy {
//        User("User1", "LastName",0)
//    }
//
//    println(user2.firstName)
//}
//class User(var firstName: String, var lastName: String, var age: Int) {
//    init {
//        println("User: $firstName was created")
//    }
//}


/*
OOP: Singleton -2
 */

//fun main(args: Array<String>) {
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//}
//
//object Database {
//    init {
//        println("Database created")
//    }
//}

/*
OOP: Singleton -1
 */

//fun main(args: Array<String>) {
//    val instance = Database.getInstance()
//    val instance2 = Database.getInstance()
//    println(instance)
//    println(instance2)
//}
//
//class Database private constructor() {
//
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//
//            return instance
//        }
//    }
//}


/*
OOP: Companion Object
 */

//fun main(args: Array<String>) {
//    val result = Calculator.sum(5, 10)
//    val max = Int.MAX_VALUE
//    println(result)
//}
//
//class Calculator() {
//    companion object {
//        fun sum(a: Int, b: Int): Int {
//            return a + b
//        }
//    }
//}

/*
OOP: lateinit keyword
 */
//fun main(args: Array<String>) {
//    val user = User("Alex", "Dobbbi", 23)
//
//    user.favoriteMovie = "Interstellar"
//    println(user.favoriteMovie)
//}
//
//class User(var firstName: String, var lastName: String, var age: Int) {
//    lateinit var favoriteMovie: String
//}

//fun main(args: Array<String>) {
//    val user = User("Alex")
//    val friend = User(firstName = "John", lastName = "Smith")
//    val user2 = User(age = 19, firstName = "Ioana", lastName = "Dobbbi")
//
//    user.firstName = "Vlad"
//
//    println(user.firstName)
//    println(user.lastName)
//    println(user.age)
//
//    println("\n")
//
//    println(friend.firstName)
//    println(friend.lastName)
//    println(friend.age)
////    println("Name ${friend.name} ")
//}

/*
OOP: Getters and Setters
 */

//class User(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
//    var firstName = firstName
//        get() {
//            return "FirstName: $field"
//        }
//        set(value) {
//            println("$value was assigned to firstName property")
//            field = value
//        }
//}


//class User(var name: String, var lastName: String, var age: Int){
//
//    constructor(name: String) : this(name, "LastName",0) {
//        println("2nd")
//    }
//
//    constructor(name: String, lastName: String): this(name,lastName,0) {
//        println("3rd")
//    }
//}

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


