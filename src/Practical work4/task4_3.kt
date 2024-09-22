package `Practical work4`
fun grade(score: Int): String {
    return when {
        score < 2 || score > 5 -> "Некорректное значение"
        score >= 5 -> "A"
        score >= 4 -> "B"
        score >= 3 -> "C"
        score >= 2 -> "D"
        else -> "F"
    }
}

fun main() {
    val score = readln().toInt()
    println("Оценка для $score: ${grade(score)}")

}
