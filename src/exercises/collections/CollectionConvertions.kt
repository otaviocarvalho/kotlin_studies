package exercises.collections

fun main() {
    // Functions to convert collections
    println("Convert to mutable list:")
    val list = listOf("bla", "ble", "bli")

    var mutableList = list.toMutableList()
    mutableList.add(0, "blo")

    for (i in mutableList) {
        println(i)
    }

    println("Convert to set:")
    val numList = listOf(2.0, 2.0, 3.0)
    val numSet = numList.toSet()
    for (i in numSet) {
        println(i)
    }
}
