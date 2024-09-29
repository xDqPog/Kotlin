import kotlin.random.Random

fun main(){
    var arr = Array<Int>(10, {Random.nextInt(-50, 50)})
    var arrreversed:Array<Int> = arr.reversedArray()
    println(arr.joinToString(", "))
    println(arrreversed.joinToString(", "))
}