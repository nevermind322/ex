package exercises/*
Напишите класс, который вначале принимает с клавиатуры целое положительное
число (в переменную х). Затем класс выводит на экран в
строку все целые числа из диапазона -|x| ... |x| (не включая крайние значения
диапазона). Числа должны отделяться друг от друга знаком
«пробел». Перед началом и после окончания вывода серии чисел на
экран вывода следует вывести текстовые сообщения (по выбору).
*/
fun main(){
    print("Vvedite chislo >>>")
    val input = readLine()!!.toInt()
    println("start")
    for (j in -input+1..input-1 ){
        print("$j ")
    }
    println("\nend")
}