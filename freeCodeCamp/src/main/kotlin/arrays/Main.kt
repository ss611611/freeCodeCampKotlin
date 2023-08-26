package arrays

fun main(args: Array<String>) {
    val names = arrayOf("John", "Stephen", "Megan")
    val numbers = arrayOf(4,5,6,7,4,"Name 1",'a')

    names[0] = "Alex"
    println("First element ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (i in numbers) {
        if (i is String) {
            println(i)
        }
    }
}