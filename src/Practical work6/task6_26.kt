import kotlin.random.Random

fun main() {
    val arr = Array<Int>(10, {Random.nextInt(-30, 30)})
    val avg = average(arr)
    println("Среднее арифметическое: $avg")
}

fun average(arr: Array<Int>): Double {
    if (arr.isEmpty()) return 0.0
    return arr.sum().toDouble() / arr.size
}