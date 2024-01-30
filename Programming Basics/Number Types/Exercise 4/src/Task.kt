// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long {
  val minute=hours.toLong()*60
   val minutes=minutes.toLong()+minute
  val seconds= minutes.toLong()*60
  val mils= seconds.toLong()* 1000
  return mils
}


fun main() {
  println(convertToMilliseconds(1, 30, 0))
}