interface Shape {
    fun perimeter() : Number
    fun area() : Number
}

data class Rectangle(val height : Double, val width : Double) : Shape{
    override fun perimeter() : Double = (height + width) * 2
    override fun area() : Double = height * width
}

data class Square(val side: Double) : Shape{
    override fun perimeter() : Double = side * 4
    override fun area() : Double = side * side
}

data class Circle(val diameter : Double) : Shape {
    override fun perimeter(): Double = 3.14 * diameter
    override fun area(): Double = 3.14 * diameter * diameter / 4
}

fun main(){
    val shapesList = listOf<Shape>(Circle(3.0), Rectangle(2.0, 4.2), Square(7.0))
    shapesList.forEach{println("$it Area = ${it.area()}, Perimeter = ${it.perimeter()}")}

}