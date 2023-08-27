package oop


fun main(args: Array<String>) {
    val user = User("Alex", "Dobinca", 23)
    val friend = User("John", "Smith", 30)

    println("Name ${friend.name} ")
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        }else {
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }

    init {
        
    }

}


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


