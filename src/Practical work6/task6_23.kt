fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5)
    val array3 = intArrayOf(6, 7, 8, 9)
    val mergedArray = intArrayOf(*array1, *array2, *array3)
    println("Объединенный массив: ${mergedArray.joinToString(", ")}")
}