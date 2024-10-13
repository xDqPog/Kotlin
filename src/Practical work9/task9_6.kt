fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val stringArray = arrayOf("банан", "яблоко", "апельсин", "груша")
    val sortedArray = sortStrings(stringArray)
    println("Отсортированные строки: ")
    sortedArray.forEach { println(it) }

}