// Properties/Task4.kt
package propertiesExercise4

private const val TEN = 10

class Counter {
  var value = 0

  fun inc() {
    value += TEN
  }

  fun dec() {
    value -= TEN
  }
}