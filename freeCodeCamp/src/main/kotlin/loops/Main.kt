package loops

fun main(args: Array<String>) {
//    var number = 10
//    while (number < 10) println(number++)
//    while (number < 10) println(++number)
//    while (number < 10) {
//        println(number)
//        number++
//    }

//    var number = 10
//
//    do {
//        println(number)
//    } while (number < 10)

    var number = 0

    outer@ while (number < 5) {
        number++
        println(number)

        var i = 0

        while (i < 5) {
            if (i == 0) break@outer
            i++
            println("***%i")
        }


//        if (number in 3..7) {
//            continue
//        }

//        if (number == 7) {
//            break
//        }
//        println(number)
//    }

//    for (i in 0..10){
//        if (i in 3..8){
//            continue
//        }

//        for (i in 0..10){
//            if (i == 7){
//                break
//            }
//        println(i)
//    }
    }
}