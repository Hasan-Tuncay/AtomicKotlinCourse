// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
 var sum = 0
   var i = 0
  while (i <= n && i % 2 == 0){
    sum += i
    i+=2
  }
  return sum
}
//fun sumOfEven(n: Int): Int {
//  var result = 0
//  var i = 0
//  while (i <= n) {
//    if (i % 2 == 0) {
//      result += i
//    }
//    i++
//  }
//  return result
//}
fun main() {
  println(sumOfEven(10))  // 30
}