import kotlin.random.Random

fun main(){
    val arr1 = Array<Int>(10, { Random.nextInt(-25, 25)})
    val arr2 = Array<Int>(10, { Random.nextInt(-25, 25)})
    print("${arr1.joinToString(", ")}\n${arr2.joinToString(", ")}\nПересечения: ${arr1 intersect arr2.toSet()}")
}