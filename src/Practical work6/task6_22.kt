import kotlin.random.Random

fun main() {
    val numbers = IntArray(10) { i -> Random.nextInt(0, 50) }
    val secondMax = findSecondMax(numbers)
    if (secondMax != null) {
        println("Второй по величине элемент: $secondMax")
    } else {
        println("Второго по величине элемента нет")
    }
}

fun findSecondMax(arr: IntArray): Int? {
    if (arr.size < 2) return null
    var max = 0
    var secondMax = 0
    for (num in arr) {
        if (num > max) {
            secondMax = max
            max = num
        }
        else if (num > secondMax && num != max) {
            secondMax = num
        }
    }
    return if (secondMax != Int.MIN_VALUE) secondMax else null
}