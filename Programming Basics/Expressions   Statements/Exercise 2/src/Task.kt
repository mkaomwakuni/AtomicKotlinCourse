// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

import higherorderfunctions.sum

fun f(e:Int, r:Int) =
  sum(e,r)

fun g(t:String,y:String) = println("$t + $y")

fun h(println()) = 'h'

fun main() {
f(8,9)
g("my", "cow")
  h()
}