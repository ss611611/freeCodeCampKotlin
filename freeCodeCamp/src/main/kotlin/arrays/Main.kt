package arrays

fun main(args: Array<String>) {
    val max = findMinAndMax(arrayOf(20,40,50,60,100),true)
    val min = findMinAndMax(arrayOf(20,40,50,60,100, 2),false)
    println("The max value is = $max")
    println("The min value is = $min")
}
fun findMinAndMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax) {
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
        return max
    }else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }
        return min
    }
}

//fun findMax(numbers: Array<Int>): Int {
//    var max = numbers[0]
//
//    for (number in numbers) {
//        if (number > max) {
//            max = number
//        }
//    }
//
//    return max
//}
//
//fun findMin(numbers: Array<Int>): Int {
//    var min = numbers[0]
//
//    for (number in numbers) {
//        if (number < min) {
//            min = number
//        }
//    }
//
//    return min
//}
//    val names = arrayOf("John", "Stephen", "Megan")
//    val maxedElements = arrayOf(4,5,6,7,4,"Name 1",'a')
//
//    names[0] = "Alex"
//    println("First element ${names[0]}")
//    println("The size of the array is: ${names.size}")
//
//    for (i in maxedElements) {
//        if (i is String) {
//            println(i)
//        }
//    }
