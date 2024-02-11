// Testing/Task1.kt
package testingExercise1
import atomictest.eq

fun abs(number: Int): Int = Math.abs(number)

fun main() {
  abs(0) eq 0
  abs(42) eq 42
  abs(-239) eq 239
}