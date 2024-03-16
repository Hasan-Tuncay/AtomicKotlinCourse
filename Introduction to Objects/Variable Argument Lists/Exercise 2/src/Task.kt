// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(  string: String, vararg int: Int) {
    println(string + int.toList())
}
//fun printArgs(s: String, vararg ints: Int) {
//    println("$s${ints.toList()}")
//}
fun main() {
   printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */