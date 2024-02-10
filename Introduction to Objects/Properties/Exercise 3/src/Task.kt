// Properties/Task3.kt
package propertiesExercise3

class Robot {
  var x = 0
  var y = 0
  val fieldSize = 100

  fun crossBoundary(coordinate: Int): Int {
    val inBounds = coordinate % fieldSize
    println("inBounds first $inBounds")
    return if (inBounds < 0) {
      fieldSize + inBounds
    } else {
      inBounds
    }
  }

  fun right(steps: Int) {
    x += steps
    x = crossBoundary(x)
  }

  fun left(steps: Int) {
    x -= steps
    x = crossBoundary(x)
  }

  fun down(steps: Int) {
    y += steps
    y = crossBoundary(y)
  }

  fun up(steps: Int) {
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(50)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())

  val inBounds = 10 % 90
  println("inBounds ff $inBounds")
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/