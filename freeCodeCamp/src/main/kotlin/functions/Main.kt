package functions

fun main(args: Array<String>) {
//    println( sum(5, 6, 7, 10,5,6,4,5,3,4,5,6,4,4,6,5))
    sum(1,4,6,7,8,9,5,7,6)
}

//fun sum(vararg numbers: Int): Int {
//   var result = 0
//    for (number in numbers){
//        result += number
//    }
//
//    return  result
//}
fun sum(vararg numbers: Int) {
    numbers.forEach { println(it) }
}