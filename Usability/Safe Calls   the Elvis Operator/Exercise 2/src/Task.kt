// SafeCallsAndElvis/Task2.kt
package safeCallsAndTheElvisOperatorExercise2
import atomictest.eq

data class Client(
  val name: String,
  val personalInfo: PersonalInfo? = null)

data class PersonalInfo(
  val email: String? = null,
  val address: Address? = null)

data class Address(
  val country: String? = null,
  val city: String? = null,
  val street: String? = null)

fun Client.fromMunich(): Boolean =TODO()

fun main() {
  val alice = Client("Alice",
    PersonalInfo(address = Address("Germany", "Munich")))
  alice.fromMunich() eq true
  Client("Bob").fromMunich() eq false
}