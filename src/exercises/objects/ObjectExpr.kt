package exercises.objects


open class A(x: Int) {
    open val y: Int = x
}

interface B

fun main() {
    // anonymous class that inherits from multiple types (passing arguments to super constructor)
    val ab: A = object : A(1), B {
        override val y = 15
    }

    println(ab.y)
}
