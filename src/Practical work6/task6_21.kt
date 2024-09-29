fun main() {
    var arr = mutableListOf(0, 5, 1, 5, 12, 53, 65, 14, 6, 10, 32, 5)
    for (a in 0 until arr.size) {
        print("${arr[a]} ")
    }
    println("\nВыберете любой элемент из массива: ")
    var ara:Int = readln().toInt()
    arr.removeAt(ara)
    println(arr.joinToString(" "))
}