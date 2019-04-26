package exercises.objects

data class Point(val x: Int, val y: Int) {

    override fun toString(): String {
        return "Point(x = $x, y = $y)"
    }
    companion object Factory {
        fun create(x: Int, y: Int): Point = Point(x, y)
    }
}

fun main() {
    println(Point.create(2,4).toString())
    println(Point(4,8).toString())
}
