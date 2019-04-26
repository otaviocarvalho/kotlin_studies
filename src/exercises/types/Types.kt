package exercises.types

fun main() {
    // Mutable variables
    var age = 10
    age = 12
    println("Age is $age")

    // Immutable variables
    val height = 180
    println("Height is $height")

    var name : String = "Kevin"
    name = "Kevin"
    println("The name of the user is $name")

    var text = "Kevin is a good fellow"
    println("Text character count is ${text.length}")
}