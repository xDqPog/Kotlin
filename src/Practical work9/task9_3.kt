package package9

fun main(){
    print(  "--------------------------------------\n"+
            "|   Курс                             |\n" +
            "|              1 доллар = 92 рубля   |\n" +
            "--------------------------------------\n ")
    print("\nDollars = ")
    val dollar = readln().toInt()
    println("\n${dollar}$ to rubles = ${dollar * 92}P")
}