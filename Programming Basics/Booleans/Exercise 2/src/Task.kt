// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first:Boolean, second: Boolean) {
  println(  "$first && $second == ${first&&second}")




}

fun showOr(first:Boolean, second: Boolean)  {
  println(  "$first || $second == ${first||second}")

}

fun showTruthTable() {
   showAnd(false,true)
  showAnd(false,false)
  showAnd(true,false)
  showAnd(true,true)

  showOr(true,true)
  showOr(false,true)
  showOr(true,false)
  showOr(false,false)
}

fun main() {
  showTruthTable()
}