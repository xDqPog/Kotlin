import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    println("Массив 1 = ${arr.joinToString(", ")}")
    val arrSecond = arr.copyOf()
    println("Скопированный массив = ${arrSecond.joinToString(", ")}")
}