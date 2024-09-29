import kotlin.random.Random

fun main(){
    var arr = Array<Int>(10, {Random.nextInt(1, 10)})
    var sum:Int = arr[0]
    println("Массив = ${arr.joinToString(", ")}")
    for (a in 1 until arr.size){
        sum *= arr[a]
    }
    println("Произведение всех элементов массива = $sum")
}