/*
Сдвинуть число по кругу влево
Например, 1234 -> 2341 (1 сдвиг)
          1234 -> 3412 (2 двига)
*/
fun main(args: Array<String>) {
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    print("Vvedite kol-vo sdvigov >>>")
    val count = readLine()!!.toInt()
    var x = input
    var i = 1
    var res = input
    if( count >= 1){
    while(x !in 0..9){
        i *=10
        x/= 10
    }
    res = (res % i) * 10 + x
    for (j in 1..count-1) {
        x = res
        x /= i
        res = (res % i) * 10 + x

    }
    println(res)
}}