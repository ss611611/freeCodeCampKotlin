package functions

fun main(args: Array<String>) {
    val max = getMax(5, 9)
    println(max)
}

fun getMax(a: Int, b: Int) = if (a > b) a else b