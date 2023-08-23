package integerType

fun main() {
    var number = 22

    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE

    println("Int naximum value is: $maxIntegerValue")
    println("Int minimum value is: $minIntegerValue")

    number = 2147483647

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE

    println("Byte naximum value is: $myMaxByteValue")
    println("Byte minimum value is: $myMinByteValue")

    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE

    println("Short naximum value is: $myMaxShortValue")
    println("Short minimum value is: $myMinShortValue")

    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE

    println("Long naximum value is: $myMaxLongValue")
    println("Long minimum value is: $myMinLongValue")
    val myNumber = 28
}