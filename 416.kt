/*
Поменять первую и последнюю цифру в числе местами
Например,  1347 -> 7341
*/
fun main() {
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    var x = input
    var res = x
    var i = 1
    while  (x !in 0..9 ){
        x /= 10
        i *= 10
    }

    res = res + (res%10 - x)*i + x - res%10
    println(res)
}