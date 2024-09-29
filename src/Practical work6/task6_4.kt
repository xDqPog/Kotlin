import kotlin.random.Random

fun main() {
    val arr = Array<Int>(10, { Random.nextInt(0, 100) })
    var arrSorted = arr.sortedArray()
    println("${arr.joinToString(", ")}\n" +
            "${arrSorted.joinToString(", ")} - отсортированный")
}