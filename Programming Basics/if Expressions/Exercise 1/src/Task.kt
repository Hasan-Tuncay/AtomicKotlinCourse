// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String =
when{
  number<0-> "negative"
  number >0 -> "positive"
  else->"zero"
}

fun main() {
  println(checkSign(-19))  // negative
}