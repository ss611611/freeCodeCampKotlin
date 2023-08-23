package functions

fun main(args: Array<String>) {
    sendMessage(
//        message = "Hello",
        name = "Alexa"
    )
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and message = $message")
}
fun sendText() = "Some text!"