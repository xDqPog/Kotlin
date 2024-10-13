import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var userGuess: Int? = null
    var attempts = 0

    println("Я загадал число от 1 до 100. Попробуйте угадать его!")

    while (userGuess != randomNumber) {
        print("Введите ваше предположение: ")
        val input = readLine()

        userGuess = input?.toIntOrNull()
        if (userGuess == null) {
            println("Пожалуйста, введите действительное число.")
            continue
        }
        attempts++
        when {
            userGuess < randomNumber -> println("Загаданное число больше!")
            userGuess > randomNumber -> println("Загаданное число меньше!")
            else -> println("Поздравляем! Вы угадали число $randomNumber с $attempts попыток!")
        }
    }
}