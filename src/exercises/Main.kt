package exercises/*
Представить число в полной форме
Например, 322 = 300 + 20 + 2
*/
fun main(args: Array<String>) {
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    var x = input
    var str = ""
    var i = 1
    while (x !in 0..9){
        str = " + ${(x%10) * i}" + str
        i *= 10
        x /= 10
    }
    str = input.toString() + " = ${(x%10) * i}" + str
    println(str)
}