import kotlin.random.Random

fun main(){
    println("${Array<Int>(5, {Random.nextInt(-100, 100)}).joinToString(", ")}")
}