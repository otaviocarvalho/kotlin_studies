package exercises.objects

fun main() {
    val coordinatesSingleton = object {
        var x: Int = 22
        var y: Int = 42
    }

    println("Coordinates are ${coordinatesSingleton.x} and ${coordinatesSingleton.y}")
}
