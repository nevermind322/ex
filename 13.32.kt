/*
Для вычисления числа п используется формула Эйлера: ir 2 / 6 равно
сумме ряда
1 1 1 1
!2+22+32+ 4 2 + ....

 */
import kotlin.math.sqrt
fun main(){
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    var res = 0.0
    for (i in 1..input) res += 1.0 / (i*i)
    res *= 6
    res = sqrt(res)
    print(res)

}