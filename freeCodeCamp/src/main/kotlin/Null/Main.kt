package Null

fun main(args: Array<String>) {
    var text: String? = null

    text = "The variable is not null."
    var text2 = ""

    if (text != null) {
        text2 = text
    } else {
        text2 = "he variable is null."
    }
    println(text2)
}