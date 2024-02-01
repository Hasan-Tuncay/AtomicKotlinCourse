// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var letter=""
  for ( x in 'a'..'z'){
letter += x
  }
  return letter
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}