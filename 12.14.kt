/*
Серия случайных чисел называется «уравновешенной», если количество
положительных и отрицательных чисел в серии - одинаково.
Напишите класс, который генерирует серию из 30 случайных целых
чисел из диапазона от -20 до 20 и проверяет, является ли серия «уравновешенной)>.
*/
fun main() {
    var k = 0
    for (i in 1..30) {
        val rnd = (-20..20).random()
        if (rnd !=0){
        k = if (rnd>0) ++k else --k
        }
    }
    print(if(k==0)"Серия является уравновешенной" else "Серия не является уравновешенной")
}