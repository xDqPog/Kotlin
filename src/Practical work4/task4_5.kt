package `Practical work4`
fun chislo(num: Int): String {
    return when {
        num > 0 -> "Положительное"
        num < 0 -> "Отрицательное"
        else -> "Ноль"
    }
}

fun main() {
    val number = readln().toInt()
    println("Число $number является: ${chislo(number)}")
}
