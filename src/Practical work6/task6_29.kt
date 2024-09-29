fun main() {
    val arr = intArrayOf(12, 5, 1, 8, 7, 3) // Пример массива
    val median = findMedian(arr)
    println("Медиана: $median")
}

fun findMedian(arr: IntArray): Double {
    val sortedArray = arr.sortedArray()
    val n = sortedArray.size
    return if (n % 2 == 0) {
        (sortedArray[n / 2 - 1] + sortedArray[n / 2]) / 2.0
    } else {
        sortedArray[n / 2].toDouble()
    }
}