package exercises/*
Перевернуть число
Например,  1337 -> 7331
*/
fun main(){
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    var x = input
    var res = 0
    var i = 1
    while (x != 0){
        res = res*10 + x%10
        x /= 10
    }
    println(res)
}