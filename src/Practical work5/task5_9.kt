package `Practical work5`
fun main() {
    println("Введите строку:")
    val inputString = readLine()

    if (inputString != null) {
        val reversedString = inputString.reversed()
        println("Строка в обратном порядке: $reversedString")
    } else {
        println("Пожалуйста, введите корректную строку.")
    }
}