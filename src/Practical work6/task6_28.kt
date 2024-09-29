fun main() {
    print("Введите элементы массива разделенных пробелами: ")
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(list.joinToString(", "))
}