package collectionsOperations

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))

    /*
    Flatten
     */
//    val numbersSets = arrayOf(arrayOf(1,2,3,), arrayOf(4,5,6), arrayOf(7,8,9))
//    println(numbersSets[2][2])
    val numbersSets = listOf(setOf(1,2,3,), setOf(4,5,6), setOf(7,8,9))
//    for (numbers in numbersSets) {
//        for (number in numbers) {
//            println(number)
//        }
//        println("\n")
//    }
    val numbersFlatten = numbersSets.flatten()
    for (number in numbersFlatten){
        println(number)
    }
}


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