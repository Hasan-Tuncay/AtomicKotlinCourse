// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
//  if (list.toList().isEmpty()) return 0
  // İlk elemanı geçici maksimum olarak ayarla
  var temp = 0

  // Listenin her elemanı için döngü
  for (i in list) {
    // Eğer bulunan bir değer geçici maksimumdan büyükse, bu değeri yeni geçici maksimum yap
    if (i > temp) {
      temp = i
    }
  }

  // Tüm liste tarandıktan sonra, bulunan maksimum değeri döndür
  return temp
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}