// SafeCallsAndElvis/Task3.kt
package safeCallsAndTheElvisOperatorExercise3
/**
 *
 * fullInfo metodunu bir data class'ın içinde tanımlamakla bir extension method olarak yazmanın temel farkları şunlardır:
 *
 * Data Class İçinde Metod Tanımlama
 * Metod, class'ın doğrudan bir parçası olur ve class'ın özelliklerine doğrudan erişebilir.
 * Bu yaklaşım, metodun class ile birlikte mantıksal olarak gruplandırılmasını sağlar,
 * bu da kodun okunabilirliğini ve organizasyonunu iyileştirebilir.
 * Data class tanımlandıktan sonra, class'ın içindeki metodlar class ile birlikte derlenir ve paketlenir.
 * Class'ın içinde tanımlanan metodlar, class'ın instance'ları tarafından doğrudan çağrılabilir.
 * Extension Method Olarak Tanımlama
 * Extension metodlar, mevcut bir class'a yeni fonksiyonellikler eklemenin bir yoludur, ancak bu metodlar class'ın kendisinin bir parçası değildir.
 * Yani, class'ın kodunu değiştirmeden class'a yeni metodlar ekleyebilirsiniz.
 * Extension metodlar, class'ın özelliklerine ve metodlarına erişebilir, ancak yalnızca public veya internal erişilebilir olanlara.
 * Bir extension method, class'ın dışında tanımlandığı için, bu metodun class'la doğrudan ilişkili olduğunu anlamak bazen daha zor olabilir.
 * Bu, büyük projelerde kodun okunabilirliğini azaltabilir.
 * Extension metodlar, başka bir dosyada tanımlanabilir ve bu, kod organizasyonu açısından esneklik sağlar.
 * Örneğin, fullInfo metodunu Client data class'ının içinde tanımlamak, bu metodun Client nesneleri için özel olarak tasarlandığını ve
 * doğrudan bu nesnelerle ilişkili olduğunu vurgular. Extension method olarak tanımlamak ise,
 * Client class'ını değiştirmeden sonradan bu fonksiyonelliği eklemenize olanak tanır,
 * bu da özellikle üzerinde çalıştığınız class'ların kaynak kodlarına erişiminiz olmadığı durumlarda yararlıdır.
 *
 * Sonuç olarak, her iki yaklaşımın da kullanımı, ihtiyacınıza, kodun organizasyonuna ve okunabilirliğine bağlı olarak değişir.
 *
 *
 *
 *
 *
 * */
data class Client(
  val name: String,
  val personalInfo: PersonalInfo? = null){
  fun fullInfo():String{
return    """
       |name: $name
       |email: ${exists(personalInfo?.email)}
       |country: ${exists(personalInfo?.address?.country)}
       |city: ${exists(personalInfo?.address?.city)}
       |street: ${exists(personalInfo?.address?.street)}
    """.trimMargin()
  }
}

data class PersonalInfo(
  val email: String? = null,
  val address: Address? = null)

data class Address(
  val country: String? = null,
  val city: String? = null,
  val street: String? = null)

fun exists(s: String?) = s
  ?: "Unspecified"

fun Client.fullInfo2(): String = """
       |name: $name
       |email: ${exists(personalInfo?.email)}
       |country: ${exists(personalInfo?.address?.country)}
       |city: ${exists(personalInfo?.address?.city)}
       |street: ${exists(personalInfo?.address?.street)}
    """.trimMargin()

fun main() {
  val alice = Client("Alice",
    PersonalInfo(
      email = "alice@gmail.com",
      address = Address("Germany", "Munich")))
  alice.fullInfo2()
  println(alice.fullInfo2())
  println("---")
  println(Client("Bob").fullInfo())
}
/* Output:
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
---
name: Bob
email: Unspecified
country: Unspecified
city: Unspecified
street: Unspecified
*/