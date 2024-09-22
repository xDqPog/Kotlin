package `Practical work3`
fun main() {
    var a = readln().toInt();
    var b = readln().toInt();
    var c = readln().toInt()
    if ((a <= b + c) and (b <= a + c) and (c <= b + a)) print("Такой треугольник может существовать")
    else println("Такой треугольник не может существовать")
}