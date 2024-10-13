fun four(n: Int):MutableList<String> {
    var arr = mutableListOf<String>()
    for (i in 1..n){
        when{
            i % 3 == 0 -> arr.add("Физллл")
            i % 5 == 0 -> arr.add("Бизлллл")
            else -> arr.add(i.toString())
        }
    }
    return arr
}

fun main() {
    println(four(5).joinToString(", "))
    println(four(10).joinToString(", "))
    println(four(20).joinToString(", "))
}
