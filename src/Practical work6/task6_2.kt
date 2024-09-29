import kotlin.random.Random

fun main() {
    var arr = Array<Int>(5, { Random.nextInt(0, 100) })
    println("${arr.joinToString(", ")}\n${arr.sum()}")
}