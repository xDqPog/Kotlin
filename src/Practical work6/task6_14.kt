import kotlin.random.Random

fun main(){
    var arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    println("Ваш массив: ${arr.joinToString(", ")}")
    print("\nЧисла в массиве, что делятся на 3: ")
    arr.forEachIndexed() { index, element ->
        if (arr[index] % 3 == 0) print("${arr[index]} ")
    }
}