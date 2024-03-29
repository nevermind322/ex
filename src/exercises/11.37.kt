package exercises/*
Напишите класс, который генерирует 20 случайных чисел из диапазона
от-18до 18.
Для каждого отрицательного числа следует вывести на экран само
число и его квадрат (в одной строке), для положительного - само
число и округленный (по правилам округления, принятым в математике)
корень из числа. Значения, равные нулю, не выводятся на экран
вообще.
*/
import kotlin.math.*
fun main() {
    for (i in 1..20){
        val rnd = (-18..18).random()
        if (rnd<0){println("$rnd ${rnd*rnd} ")}
        if (rnd>0){println("$rnd ${round(sqrt(rnd.toDouble()))} ")}
    }
}