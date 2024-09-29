fun main() {
    var arr = mutableListOf(0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0)
    var tof:Int = 0
    for (a in 0..arr.size/2 - 1){
        if (arr[a] == arr[(arr.size - 1) - a]) tof++
    }
    if (tof == arr.size/2) println("Массив является палиндромом")
    else println("Массив не палиндром")
}