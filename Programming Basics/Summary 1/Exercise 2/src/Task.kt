// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
    var str = ""
    for (i in 0..s.length - 1) {
        if (i % 2 == 0) {
            str += s[i]
        }
    }
    return str
}

fun main() {
    println(other("cement"))
}
/* Output:
cmn
*/