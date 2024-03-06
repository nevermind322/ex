import Directions.*

enum class Directions {
    UP,
    DOWN,
    LEFT,
    RIGHT

}

data class Point1(val x: Double, val y: Double)

fun Point1.move(direction : Directions): Point1{
    return when (direction){
        UP -> Point1(x, y + 1)
        DOWN -> Point1(x, y - 1)
        RIGHT -> Point1(x + 1, y)
        LEFT -> Point1(x -1, y )
    }
}

fun Point1.go(route : Array<Directions>) : Point1{
    var location = this
    for (i in route) {
        println(location)
        location = location.move(i)
    }
    println(location)
    return location
}
fun main(){
    val start = Point1(0.0, 0.0)
    val route = arrayOf<Directions>(
        UP,
        UP,
        LEFT,
        DOWN,
        LEFT,
        DOWN,
        DOWN,
        RIGHT,
        RIGHT,
        DOWN,
        RIGHT
    )
    val finish = start.go(route)
    print(finish)
}
