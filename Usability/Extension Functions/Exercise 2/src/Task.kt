// ExtensionFunctions/Task2.kt
package extensionFunctionsExercise2
import atomictest.eq

fun Int.isOdd(): Boolean = if (this%2==0 )false else true

fun Int.isEven(): Boolean =  if (this%2==0 )true else false

fun main() {
  1.isOdd() eq true
  2.isEven() eq true
  13.isEven() eq false
}