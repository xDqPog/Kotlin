package `Practical work5`
fun main() {
    println("Введите число:")
    val input = readLine()

    val number = input?.toIntOrNull()

    if (number != null) {
        if (prime(number)) {
            println("$number является простым числом.")
        } else {
            println("$number не является простым числом.")
        }
    } else {
        println("Пожалуйста, введите корректное число.")
    }
}

// Функция для проверки, является ли число простым
fun prime(num: Int): Boolean {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    // Проверяем делимость от 3 до корня из num
    for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}