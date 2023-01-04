data class Elephant(
    val name: String, val age: Int
)

fun main() {
    val elephant1 = Elephant("Cookie", 1)
    val elephant2 = Elephant("Pluto", 7)
    val elephant3 = Elephant("Cookie", 1)

    println(elephant1 == elephant1) // true, true
    println(elephant1 == elephant2) // false, false
    println(elephant1 == elephant3) // false, true

    println(elephant1) // Elephant@58372a00, Elephant(name=Cookie, age=1)
    println(elephant2) // Elephant@4dd8dc3, Elephant(name=Pluto, age=7)
    println(elephant3) //Elephant@6d03e736, Elephant(name=Cookie, age=1)

    val elephant = Elephant("Cookie", 1)
    println(elephant.name)
    println(elephant.age)
    val (name, age) = elephant
    println(name)
    println(age)

    // elephant.age = 2
    val newElephant = elephant.copy(age = 2)
    println(elephant)
    println(newElephant)
}
