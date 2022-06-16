// ExceptionHandling/Task2.kt
package exceptionHandlingExercise2
import atomictest.trace

open class NumberFail : Exception()
open class NoNumber : NumberFail()
open class BadNumber : NumberFail()

fun findNumber(s: String): String {
  var result = ""
  for (c in s)
    if (c in "0123456789.-")
      result += c
    else if (result.isNotEmpty())
      return result
  throw NoNumber()
}

fun convertNumber(s: String): Int =
  try {
    s.toInt()
  } catch (e: NumberFormatException) {
    throw BadNumber()
  }

fun embedNumber(n: Int) = "AbCdE${n}fGhIj"

fun justFail(s: String) =
  "TODO"

fun recover(s: String) {
  TODO()
}

fun test(s: String) {
  trace("justFail($s)")
  justFail(s)
  trace("recover($s)")
  recover(s)
}

fun main() {
  test("The13thFloor9")
  test("NoDigitsHere")
  test("negative-11int")
  test("A float: 3.14159 (pi)")
  trace eq """
    justFail(The13thFloor9)
    AbCdE13fGhIj
    recover(The13thFloor9)
    AbCdE13fGhIj
    justFail(NoDigitsHere)
    exceptionHandlingExercise2.NoNumber
    recover(NoDigitsHere)
    AbCdE0fGhIj
    justFail(negative-11int)
    AbCdE-11fGhIj
    recover(negative-11int)
    AbCdE-11fGhIj
    justFail(A float: 3.14159 (pi))
    exceptionHandlingExercise2.BadNumber
    recover(A float: 3.14159 (pi))
    AbCdE-1fGhIj
  """
}