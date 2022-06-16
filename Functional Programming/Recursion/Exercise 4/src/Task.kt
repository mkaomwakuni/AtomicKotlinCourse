// Recursion/Task4.kt
package recursionExercise4
import atomictest.eq

class City(val name: String) {
  val connections = mutableListOf<City>()

  override fun toString() = "($name, " +
    "connections: ${connections.map { it.name }})"
}

fun addConnection(first: City, second: City) {
  first.connections += second
  second.connections += first
}

fun City.allReachableRecursive(): Set<City> {
  // Stores all cities reachable from the given city:
  val connections = mutableSetOf<City>()

  // Add all connections reachable
  // from 'current' city to 'connections' Set
  fun addConnectionsFrom(current: City) {
    TODO()
  }

  addConnectionsFrom(this)
  return connections
}

fun City.allReachableIterative(): Set<City> {
  // Stores all cities reachable from the given city
  val connections = mutableSetOf<City>()
  // Stores all cities for which direct connections are to be analyzed
  val toBeAnalyzed = mutableSetOf(this)

  // For each 'current' city from 'toBeAnalyzed' set:
  // - Unmark it (remove from 'to be analyzed' set)
  // - If it's already in 'connections', do nothing
  // - Add it to 'connections'
  // - Mark all its connections as 'to be analyzed'
  while (toBeAnalyzed.isNotEmpty()) {
    TODO()
  }
  return connections
}

fun main() {
  val dublin = City("Dublin")
  val liverpool = City("Liverpool")
  val manchester = City("Manchester")
  val leeds = City("Leeds")

  addConnection(liverpool, manchester)
  addConnection(manchester, leeds)

  liverpool.allReachableRecursive() eq
    setOf(liverpool, manchester, leeds)
  dublin.allReachableRecursive() eq
    setOf(dublin)

  liverpool.allReachableIterative() eq
    setOf(liverpool, manchester, leeds)
  dublin.allReachableIterative() eq
    setOf(dublin)
}