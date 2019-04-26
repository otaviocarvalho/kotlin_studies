package exercises.expressions

fun main() {
    val a = 10
    val b = 20

    var greaterNumber : Int = 0

    if (a > b) {
        println("a is greater")
        greaterNumber = a
    } else {
        println("b is greater")
        greaterNumber = b
    }

    println("The greater number value is $greaterNumber")

    var bigNum : Int = if (a > b) {
                        println("a is greater")
                        a
                    } else {
                        println("b is greater")
                        b
                    }

    println("The greater number final value is $bigNum")
}