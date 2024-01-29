// IfExpressions/Task2.kt
package ifExpressionsExercise2

fun abs(number: Int): Int =  when{
  number<0-> number*-1
  else-> number
}


fun main() {
  println(abs(-19))  // 19
}