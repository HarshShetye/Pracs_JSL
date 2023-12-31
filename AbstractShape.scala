abstract class Shape {
    def RectangleArea(length: Double, breadth: Double): Double
    def SquareArea(side: Int): Int
    def CircleArea(radius: Double): Double
}

class Area extends Shape {
    override def RectangleArea(length: Double, breadth: Double): Double = (length*breadth)
            override def SquareArea(side: Int): Int = side*side
                    override def CircleArea(radius: Double): Double = 3.14*radius*radius
}

object HelloWorld {
    def main(args: Array[String]): Unit = {
        val area = new Area()
        println(area.RectangleArea(5.0,8.0))
        println(area.SquareArea(6))
        println(area.CircleArea(10.0))
    }
}