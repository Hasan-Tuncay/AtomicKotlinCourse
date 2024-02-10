// Properties/Task1.kt
package propertiesExercise1

  class X (){
    val a = 3
    val b = 42
    var c = 0
    fun add(): Int {
        c = a + b // Bu bir deyimdir ve bir atama işlemi yapar.
        return c // Bu bir ifadedir ve c'nin değerini döndürür.
    }

}

fun main() {
X().add()
}