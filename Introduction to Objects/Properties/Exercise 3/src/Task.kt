// Properties/Task3.kt
package propertiesExercise3

class Robot {
  var x = 0
  var y = 0

  fun right(steps: Int) {
    x += steps
  }

  fun left(steps: Int) {
    x -= steps
  }

  fun down(steps: Int) {
    y += steps
  }

  fun up(steps: Int) {
    y -= steps
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/