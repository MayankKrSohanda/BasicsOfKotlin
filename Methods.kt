class Barista(
    val name: String
) {
    fun makeCoffee(type: String, size: Int): Coffee {
        println("$name makes coffee of type $type size $size")
        return Coffee(type, size)
    }

    fun cheerAndMakeCoffee(type: String, size: Int) {
        println("Hello")
        makeCoffee(type, size)
    }
}

class Coffee(
    val type: String, val size: Int
)

fun main() {
    val barista = Barista("Jake")
    val coffee = barista.makeCoffee("Latte", 1)
    println(coffee.type)
    println(coffee.size)
    barista.cheerAndMakeCoffee("Latte", 1)

}