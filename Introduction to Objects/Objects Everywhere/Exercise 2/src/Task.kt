// ObjectsEverywhere/Task2.kt
package objectsEverywhereExercise2

import java.util.*

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean  {
 return s.reversed().lowercase()==s.lowercase()
}


fun main() {
  println(isPalIgnoreCase("Mom"))  // true
}