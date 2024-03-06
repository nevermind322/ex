

/*
Напишите метод, который получает в качестве параметра целое число
большее или равное 10. Метод возвращает число без его крайней левой
цифры.
 */

fun main(){
    fun func(x : Int): Int{
        var temp = x
        var i = 1
        if (x>=10){
            while(temp !in 1..9) {
                temp /= 10
                i *=10
            }
            return x%i
        }
        throw IllegalArgumentException("x must be >= 10")
    }
}