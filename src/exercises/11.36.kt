package exercises/*
Напишите класс, который принимает с клавиатуры целое число и выводит
на экран 10 предшествующих ему чисел, причем разница между
значениями этих чисел должна быть равна 6
*/
fun main(){
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    for (i in input-6 downTo input-60 step 6){print("$i ")}
}