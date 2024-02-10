// Constructors/Task1.kt
package constructorsExercise1

class Floating(val d: Double = 0.1) {
  override fun hashCode(): Int {
    return super.hashCode()

  }

  override fun toString(): String {
    return   "$d" //super.toString()
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Floating

    return d == other.d
  }
}


fun main() {
  val floating=Floating()
 // println(floating.hashCode())
  println(floating)
//  println(floating.equals(floating))
}