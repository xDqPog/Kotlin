fun main() {
    val numbers = arrayOf(1, 2, 2, 3, 3, 3, 2, 2)
    val (element, length) = findMaxSequence(numbers)
    println("Максимальная последовательность: элемент $element, длина $length")
}

fun findMaxSequence(numbers: Array<Int>): Pair<Int, Int> {
    if (numbers.isEmpty()) return Pair(0, 0)
    var maxElement = numbers[0]
    var maxLength = 1
    var currentElement = numbers[0]
    var currentLength = 1
    for (i in 1 until numbers.size) {
        if (numbers[i] == currentElement) {
            currentLength++
        } else {
            if (currentLength > maxLength) {
                maxLength = currentLength
                maxElement = currentElement
            }
            currentElement = numbers[i]
            currentLength = 1
        }
    }
    if (currentLength > maxLength) {
        maxLength = currentLength
        maxElement = currentElement
    }

    return Pair(maxElement, maxLength)
}