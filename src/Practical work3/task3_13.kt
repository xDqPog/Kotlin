package `Practical work3`
fun main(){
    print("Введите 4-х значное число: ")
    var ch = readln().toInt()
    var q = ch / 1000
    var w = ch / 100 % 10
    var e = ch % 100 / 10
    var r = ch % 100 % 10
    println("Введите число a: ")
    var a = readln().toInt()
    if(q + w == e + r) println("\nа) Сумма первых 2 чисел равна сумме вторых двух чисел")
    else println("\nа) Сумма первых 2 чисел не равна сумме последних двух чисел")
    if ((q + w + e + r) % 3 == 0) println("б) Сумма всех его цифр кратна 3")
    else println("б) Сумма всех его цифр не кратна 3")
    if ((q * w * e * r) % 4 == 0) println("в) Произведение всех его цифр кратно 4")
    else println("в) Произведение всех его цифр не кратно 4")
    if ((q * w * e * r) % a == 0) println("г) Произведение всех его цифр кратно $a")
    else println("г) Произведение всех его цифр не кратно $a")
}