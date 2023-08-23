package whenStatementExpression

fun main(args: Array<String>) {
    val alarm = 7

    val text = when {
        alarm == 8 || alarm == 7 -> "The time is $alarm"
        alarm <= 10 -> "The number is in the range 1..10"
        else -> "The time is $alarm"
    }

    println(text)
}