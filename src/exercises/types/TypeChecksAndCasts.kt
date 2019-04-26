package exercises.types

fun main() {
    // Smart casts
    val castToStringLengthSample = fun(x: Any) {
        if (x is String) {
            println(x.length)
        }
    }

    castToStringLengthSample("sample")

    // Smart casts for when-expressions / while-loops
    val matcher = fun(x: Any) {
        when (x) {
            is Int -> print(x + 1)
            is String -> print(x.length + 1)
        }
    }
    matcher("string")
}
