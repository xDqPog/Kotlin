package `Practical work3`
fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    if (b % a == 0) println("число $a является делителем $b")
    println(b % a)
}
