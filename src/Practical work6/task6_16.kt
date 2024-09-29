fun main(){
    var arr1 = arrayOf(1, 2, 3, 4, 5)
    var arr2 = arrayOf(6, 7, 8, 9, 0)
    var arr3 = arrayOf(*arr1, *arr2)
    println("Первый массив: ${arr1.joinToString(", ")}\nВторой массив: ${arr2.joinToString(", ")}\nОба массива в одном: ${arr3.joinToString(", ")}")
}