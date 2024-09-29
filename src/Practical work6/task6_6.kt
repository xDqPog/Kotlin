import kotlin.random.Random

fun main(){
    var arr = Array<Int>(10, {Random.nextInt(-50, 50)})
    var chet = mutableListOf(null); var nechet = mutableListOf(null)
    for (a in arr){
        if (a % 2 == 0) print("${a} ")
    }
    println()
    for (a in arr){
        if (a % 2 == 1) print("${a} ")
    }
}