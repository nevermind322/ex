package exercises

fun main(){
myClosure("Java")
repeatTask(10, myClosure, "Cock")
}

val myClosure = {x : String -> println("I love $x")}

fun <T, V> repeatTask(times : Int,  task: (T) -> V, param: T){
    for (i in 0 until times) {
        task(param)
    }
}

