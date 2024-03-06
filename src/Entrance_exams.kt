class Abiturient(val name : String){
    var result = 0
}

class Institute{
    var Studets = emptyArray<Abiturient>()
    var AbiturList = emptyArray<Abiturient>()
    fun register(newUser: Abiturient){
        AbiturList += newUser
    }
    fun exams(){
        for (i in AbiturList){
            Teacher.checkStudent(i)
        }
    }
    fun elimination(){
        val average = (AbiturList.maxOf { it.result }.toDouble() + AbiturList.minOf { it.result }.toDouble()) / 2
        for (i in AbiturList){
            if (i.result >= average) Studets += i
        }
    }
}

object Teacher{
    fun checkStudent(abit :Abiturient ){
        abit.result = (0..100).random()
    }
}

