fun main() {
    val firstTerm = 1
    val commonDifference = 3
    val terms = 10
    val progression = IntArray(terms) { i -> firstTerm + i * commonDifference }
    println(progression.joinToString(", "))
}