// ObjectsEverywhere/Task1.kt
package objectsEverywhereExercise1

fun isPalindrome(s: String): Boolean {
  var check = false
  for (i in 0.. s.length-1){
    if (s[i] != s.reversed()[i]){

      break
    } else { check=true}
  }

 return check
}

fun main() {
  println(isPalindrome("mom"))     // true
  println(isPalindrome("street"))  // false
}