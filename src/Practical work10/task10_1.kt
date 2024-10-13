fun countdown(n: Int): List<Int> {
    return if (n <= 0) {
        emptyList()
    } else {
        (n downTo 1).toList()
    }
}

fun main() {
    println(countdown(5))
    println(countdown(0))
}
