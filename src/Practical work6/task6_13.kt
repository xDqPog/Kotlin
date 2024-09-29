import kotlin.random.Random

fun main(){
    val arr1 = Array<Int>(20, { Random.nextInt(1, 100)})
    println("${arr1.joinToString(", ")}")
}