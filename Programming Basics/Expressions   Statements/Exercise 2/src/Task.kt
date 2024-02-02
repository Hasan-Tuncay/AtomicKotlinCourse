// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b : Int ) : Int = a+b

fun g(a : String , b : String) : String= a+b

fun h() = println("h()")

fun main() {
  val sum = f(1,2)
  val con = g("a","r")
  val prt= h()
  println("Int")
  println("String")
  println("Unit")
}