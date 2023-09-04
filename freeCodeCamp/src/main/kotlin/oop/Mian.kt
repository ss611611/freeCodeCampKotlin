package oop

fun main(args: Array<String>) {

    val loginButton = Button("Login",1232, object : OnClickListener{
        override fun onClick() {
            // login the user
        }

    })
    val signUpButton = Button("Sign Up",1232, object : OnClickListener{
        override fun onClick() {
            // sign up the user
        }

    })
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)

class ClickListener() : OnClickListener {
    override fun onClick() {

    }

}


interface OnClickListener {
    fun onClick()
}



/*
OOP: Interfaces 2
 */

//fun main(args: Array<String>) {
//
//}
//
//interface Engine {
//    fun startEngine()
//}
//
//class Car(val name: String, val color: String) : Engine {
//    override fun startEngine() {
//        println("The car is starting the engine")
//    }
//
//}
//
//class Truck(val name: String, val color: String) : Engine {
//    override fun startEngine() {
//        println("The truck is starting the engine")
//    }
//
//}
//
//class Plane(val name: String, val color: String) : Engine {
//    override fun startEngine() {
//        println("The plane is starting the engine")
//    }
//
//}
//
//class Tesla(val name: String, val color: String) : Engine {
//    override fun startEngine() {
//        println("tesla is starting the engine")
//    }
//
//}

/*
OOP: Data Class
 */

//fun main(args: Array<String>) {
//    val user1 = User("Alex","Dobbin",23)
//    val user2 = User("Alex","Dobbin",23)
//
//
//    println(user1.equals(user2))
//
//    println(user1)
//    println(user2)
//
//}
//
//class User(var firstName: String, var lastName: String, var age: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) {
//            return true
//        }
//
//        if (other is User) {
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
//    }
//}


/*
OOP: Abstract Classes
 */

//fun main(args: Array<String>) {
//
//}
//
//abstract class Vehicle {
//
//    abstract fun move()
//
//    abstract fun stop()
//}
//
//class Car(var name: String, var color: String, val engines: Int, val  door: Int): Vehicle(){
//    override fun move() {
//
//    }
//
//    override fun stop() {
//
//    }
//
//}


/*
OOP: Sealed Class
 */

//import java.lang.Exception
//
//fun main() {
//
//    val success = Result.Success("SUCCESS")
//    val progress = Result.Progress("PROGRESS")
//
//    getData(progress)
//}
//
//fun  getData(result: Result) {
//    when(result) {
//        is Result.Success -> result.showMessage()
//        is Result.Progress -> result.showMessage()
//        is Result.Error.NonRecoverableError -> result.showMessage()
//        is Result.Error.RecoverableError -> result.showMessage()
//    }
//}
//
//sealed class Result(val message: String) {
//    fun showMessage() {
//        println("Result: $message")
//    }
//    class Success(message: String) : Result(message)
//    sealed class Error(message: String) : Result(message) {
//        class RecoverableError(exception: Exception, message: String) : Error(message)
//        class NonRecoverableError(exception: Exception, message: String) : Error(message)
//    }
//    class Progress(message: String) : Result(message)
//}


/*
OOP: Inheritance 2
 */

//fun main(args: Array<String>) {
//
//    val view = View()
//    val button = Button("Sing Up","Center")
//    val roundButton = RoundButton("Sing Up","Center",30)
//
//    view.draw()
//    button.draw()
//    roundButton.draw()
//}
//
//open class View() {
//    open fun draw() {
//        println("Drawing the view")
//    }
//}
//
//open class Button(val text: String, val orientation: String): View() {
//    override fun draw() {
//        //here is the code for creating the button
//        println("Drawing the button")
//        super.draw()
//    }
//}
//
//class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation) {
//    override fun draw() {
//        println("Drawing the round button")
//        super.draw()
//    }
//}


/*
OOP: Inheritance 1
 */

//fun main(args: Array<String>) {
//    val car = Car("BMW", "RED", 1, 4)
//    val plane = Plane("Boeing","WHITE and BLUE",4,4)
//
//    car.move()
//    car.stop()
//
//    plane.move()
//    plane.stop()
//}
//
//open class Vehicle(val name: String, val color: String) {
//    open fun move() {
//        println("$name is moving")
//    }
//
//    open fun stop() {
//        println("$name has stopped")
//    }
//}
//
//class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
//
//}
//
//class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {
//    override fun move() {
//        flying()
//        super.move()
//    }
//
//    fun flying() {
//        println("The plane is flying")
//    }
//}


/*
OOP Challenge
 */

//fun main() {
//    val alexAccount = Account("Alex")
//    alexAccount.deposit(1000)
//    alexAccount.withdraw(500)
//    alexAccount.deposit(-20)
//    alexAccount.withdraw(-100)
//
//    val balance = alexAccount.calculateBalance()
//    println("Balance is $balance")
//    alexAccount.balance = 1000
//}
//
//class Account(val accountName: String) {
//    private var balance = 0
//    private var transactions = mutableListOf<Int>()
//
//    fun deposit(amount: Int) {
//        if (amount > 0) {
//            transactions.add(amount)
//            balance += amount
//            println("$amount deposited. Balance is now ${this.balance}")
//        } else {
//            println("Cannot deposit negative sums")
//        }
//    }
//
//    fun withdraw(withdrawal: Int) {
//        if (-withdrawal < 0) {
//            transactions.add(-withdrawal)
//            this.balance += -withdrawal
//            println("$withdrawal withdrawn. Balance is now ${this.balance}")
//        } else {
//            println("Cannot withdraw negative sums")
//        }
//    }
//
//    fun calculateBalance(): Int {
//        this.balance = 0
//        for (transaction in transactions) {
//            this.balance += transaction
//        }
//        return this.balance
//    }
//}

/*
OOP: Inner Classes
 */

//fun main(args: Array<String>) {
//    val listView = ListView(arrayOf("Name 1", "Name 2", "Name 3", "Name 4"))
//
//    listView.ListViewItem().displayItem(2)
//}
//
//class ListView(val items: Array<String>) {
//    inner class ListViewItem() {
//
//        fun displayItem(position: Int) {
//            println(items[position])
//        }
//    }
//}


/*
OOP: Enum Classes
 */

//fun main(args: Array<String>) {
//    val direction = Direction.valueOf("east".uppercase())
//
//    when(direction) {
//        Direction.EAST -> {
//            println("The direction is EAST")
//        }
//        Direction.WEST -> println("The direction is WEST")
//        Direction.NORTH -> println("The direction is NORTH")
//        Direction.SOUTH -> println("The direction is SOUTH")
//    }
//}
//
//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north",10),
//    SOUTH("south",20),
//    EAST("east",15),
//    WEST("west",40);
//
//    fun printData() {
//        println("Direction =$direction and Distance =$distance")
//    }
//}


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


