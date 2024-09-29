import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    var sum:Int = 0
    print("Сумма всех четных в массиве: ")
    arr.forEachIndexed{i, e ->
        if (e % 2 == 0) sum += arr[i]
    }
    print("$sum")
}