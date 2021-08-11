/*
В классе 35 учеников. В конце учебного года каждый ученик получает
ведомость с оценками по 8 предметам.
Напишите класс, который генерирует по 8 оценок для каждого ученика
и подсчитывает для него среднюю годовую оценку.
Для каждого ученика класс должен выводить на экран в одну строку
оценки каждого ученика и его среднюю годовую оценку.
После завершения вывода на экран оценок всех учеников класс должен
выводить в отдельной строке количество учеников, у которых среднегодовая
оценка выше 4.5, и наивысшую среднегодовую оценку.
 */
fun main(){
    var maxsr = 0.0
    var otl = 0
    for (pupil in 1..35){
        print("Ученик №$pupil Оценки: ")
        var sum = 0.0
        for (i in 1..8){
            val mark = (2..5).random()
            print("$mark ")
            sum += mark
        }
        sum /=8
        print("Средняя оценка: $sum \n")
        if (maxsr < sum) {
            maxsr = sum
        }
        if (sum >= 4.5){
            otl += 1
        }


        }
        println("\nОтличников: $otl")
        print("Наивысший средний балл:$maxsr")

    }