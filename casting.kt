interface Animal2

class Dog2(val name: String) : Animal2 {
    fun retrieve(item: String) {
        println("Retrieving $item")
    }
}

class Cat2(val name: String) : Animal2 {
    fun pet() {
        println("Meow")
    }
}

fun play(animal2: Animal2) {
    when (animal2) {
        is Dog2 -> animal2.retrieve("stick")
        is Cat2 -> animal2.pet()
    }
}

fun main() {
    play(Dog2("Rex")) // Retrieving stick
    play(Cat2("Garfield")) // Mrr
}