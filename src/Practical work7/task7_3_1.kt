fun main() {
    println("Введите список чисел через пробел: ")
    val input = readLine()
    val numbers: List<Int> = input?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()
    if (numbers.isNotEmpty()) {
        val min = numbers.minOrNull()
        println("Самое маленькое число в массиве: $min")
    } else {
        println("Список не содержит чисел.")
    }
}