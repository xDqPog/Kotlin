import kotlin.random.Random

fun main(){
    val arr1 = Array<Int>(10, { Random.nextInt(-25, 25)})
    print("${arr1.joinToString(", ")}\n\nВведите индекс элемента который хотите поменять:")
    val r1 = readln().toInt()
    print("Введите индекс элемента который хотите поменять:")
    val r2 = readln().toInt()
    var tmp = arr1[r1]
    arr1[r1] = arr1[r2]
    arr1[r2] = tmp
    println("Измененный массив ${arr1.joinToString(", ")}")
}