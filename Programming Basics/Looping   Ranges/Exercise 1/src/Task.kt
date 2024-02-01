// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var facMultply=1L
  for (i in 1.. n){
    facMultply*=i
  }
return facMultply

}

fun main() {
  println(factorial(10))  // 3628800
}