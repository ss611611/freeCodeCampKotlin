package collectionsOperations

fun main() {
    println(searchElement(27, mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)))
}

private fun searchElement(searchElement: Int, numbers: MutableList<Int>): Int {
    return numbers[numbers.binarySearch(27)]
}

//private fun searchElement(searchElement: Int, numbers: MutableList<Int>): Int {
//    var low = 0
//    var high = numbers.size -1
//
//    var i = 0
//    while (low <= high) {
//        i++
//        println("Search number: $i")
//        val mid = (low + high) / 2
//        val cmp = numbers[mid].compareTo(searchElement)
//
//        if (cmp < 0) {
//            low = mid + 1
//        } else if (cmp > 0) {
//            low = mid - 1
//        } else {
//            return numbers[mid]
//        }
//    }
//    return -1
//}



//private fun searchElement(searchElement: Int, numbers: MutableList<Int>): Int {
//    var i = 0
//    for (number in numbers) {
//        i++
//        println("Search number: $i")
//        if (number == searchElement) {
//            return number
//        }
//    }
//    return -1
//}


//fun main() {
//    val numbers = mutableListOf(2,5,1,40,20,100,60)
//    numbers.sorted().forEach { println(it) }
//
//    val laptops = mutableListOf(
//        Laptop("Dell", 2021,4,600),
//        Laptop("Acer", 2020,8,800),
//        Laptop("Dell", 2022,16,1000),
//    )
//
//    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(compareBy { it.ram }).forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price })
//
//}
//
//data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)

//fun main() {
//    val numbers = mutableListOf(2,5,1,40,20,100,60)
//    numbers.sorted().forEach { println(it) }
//
//    val laptops = mutableListOf(
//        Laptop("Dell", 2021,4,600),
//        Laptop("Acer", 2020,8,800),
//        Laptop("Dell", 2022,16,1000),
//    )

//    println("\n")
//    laptops.sorted().forEach { println(it) }
//    println("\n")
//
//    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
//    println("\n")
//    laptops.sortedWith(ComparatorYear()).forEach { println(it) }
//}

//data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
//    override fun compareTo(other: Laptop): Int {
//        return if (this.price > other.price) {
//            println("In if statement: Swapping ${this.brand} with ${other.brand}")
//            1
//        } else if (this.price < other.price) {
//            println("In if statement: Swapping ${this.brand} with ${other.brand}")
//            -1
//        } else {
//            0
//        }
//    }
//}
//
//class ComparatorRam : Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.ram > laptop2.ram) {
//            return 1
//        } else if (laptop1.ram < laptop2.ram) {
//            return -1
//        } else {
//            return 0
//        }
//    }
//}
//
//
//class ComparatorYear : Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.year > laptop2.year) {
//            return 1
//        } else if (laptop1.year < laptop2.year) {
//            return -1
//        } else {
//            return 0
//        }
//    }
//}



        /*
        Aggregate Operations
         */
//fun main() {
//    val numbers = listOf(6, 10, 14, 4, 100)
//    println("The sum is ${numbers.sum()}")
//    println("The count is: ${numbers.count()}")
//    println("The average is: ${numbers.average()}")
//    println("The max value is: ${numbers.maxOrNull()}")
//    println("The nin value is: ${numbers.minOrNull()}")
//    println("The sum is: ${numbers.sumOf { it * 2 }}")
//}


            /*
            Retrieve Single Elements
             */
//fun main() {
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.elementAt(3))
//    println(numbers.first())
//    println(numbers.last())
//
//    println("\n")
//    println(numbers.first { it.length > 3 })
//    println(numbers.last { it.startsWith("f") })
//    println(numbers.random())
//    println(numbers.isEmpty())
//}



        /*
        Retrieve Collection parts
         */
//fun main() {
//    val numbersStrings = mutableListOf("one", "two", "three", "four", "five","six")
//    println(numbersStrings.slice(1..3))
//    println(numbersStrings.slice(0..4 step 2))
//    println(numbersStrings.slice(setOf(3, 5, 0)))
//
//    println("\n")
//    println(numbersStrings.take(3))
//    println(numbersStrings.takeLast(3))
//    println(numbersStrings.drop(1))
//    println(numbersStrings.dropLast(5))
//
//    println("\n")
//    println(numbersStrings.takeWhile { !it.startsWith("f") })
//    println(numbersStrings.takeLastWhile { it != "three" })
//    println(numbersStrings.dropWhile { it.length == 3 })
//    println(numbersStrings.dropLastWhile { it.contains("i") })
//
//    val numbers = (0..13).toList()
//    println(numbers.chunked(3))
//    println(numbers.chunked(3) {it.sum()})
//
//    println("\n")
//    val numbersStrings2 = numbersStrings
//    println(numbersStrings2.windowed(3))
//}



        /*
        Grouping
         */
//fun main() {
//    val numbers = mutableListOf("one","two","three","four","five")
//    println(numbers.groupBy { it.first().uppercase() })
//    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
//}


        /*
        Plus and Minus Operators
         */
//fun main() {
//    val numbers = mutableListOf("one","two","three","four")
//    val plusList = numbers + "five"
//    val minusList = numbers - mutableListOf("three","four")
//    println(plusList)
//    println(minusList)
//}


     /*
     Filtering, Test Predicates
      */

//fun main() {
//    val  numbers = listOf("one","two","three","four")
//    val longThan3 = numbers.filter { it.length > 3 }
//    println(longThan3)
//
//    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
//    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
//    println(filteredMap)
//
//    val filteredIdx = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
//    val filteredNot = numbers.filterNot { it.length <= 3 }
//    println(filteredIdx)
//    println(filteredNot)
//
//    val mixedList = listOf(1,2,3,'A','B','C',"Hello World","Alex",false)
//    mixedList.filterIsInstance<Boolean>().forEach {
//        println(it)
//    }
//    //Partition
//    println("\n")
//
//    val (match,rest) = numbers.partition { it.length > 3 }
//    println(match)
//    println(rest)
//    println(numbers.any() {it.endsWith("e")})
//    println(numbers.none() {it.endsWith("w")})
//    println(numbers.all { it.length > 1 })
//}



    /*
    String Representation
     */
//fun main() {
//    val numbersStrings = listOf("one", "two", "three", "four")
//    println(numbersStrings)
//    println(numbersStrings.joinToString())
//
//    val listString = StringBuffer("The list of numbers: ")
//    println(numbersStrings.joinTo(listString))
//
//    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
//
//    val numbers = (1..100).toList()
//    println(numbers.joinToString(limit = 25, truncated = "<...>"))
//
//    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
//}



    /*
        Flatten
     */

//fun main() {
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.associateWith { it.length })
//    println(numbers.associateBy { it.first().uppercase() })
//    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

//    val numbersSets = arrayOf(arrayOf(1,2,3,), arrayOf(4,5,6), arrayOf(7,8,9))
//    println(numbersSets[2][2])
//    val numbersSets = listOf(setOf(1,2,3,), setOf(4,5,6), setOf(7,8,9))
//    for (numbers in numbersSets) {
//        for (number in numbers) {
//            println(number)
//        }
//        println("\n")
//    }
//    val numbersFlatten = numbersSets.flatten()
//    for (number in numbersFlatten){
//        println(number)
//    }
//}


//fun main() {
//    val numbers = setOf(1,2,3,4,5)
//    println(numbers.map { if (it == 3) it * 100 else it * 10 })
//    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value  })
//    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
//    println(numbersMap.mapKeys { it.key.uppercase() })
//    println(numbersMap.mapValues { it.value + it.key.length })
//
        /*
            Zipping
        */
//    val color = listOf("red","brown","grey")
//    val animals = listOf("fox","bear","wolf")
//    println(color zip animals)
//    println(color.zip(animals){color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color"})
//
//    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
//    println(numberPairs)
//    println(numberPairs.unzip())
//}