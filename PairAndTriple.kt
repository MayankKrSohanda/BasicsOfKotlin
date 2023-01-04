fun main() {
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A

    val (num, char) = pair
    println(num) // 1.0
    println(char) // A

    val (number, character) = Pair(45, 'B')
    println(number) // 45
    println(character) // B

    val anotherPair = 1.0 to 'A'
    println(anotherPair.first) // 1.0
    println(anotherPair.second) // A


    val triple = Triple(1.0, "ABC", true)
    println(triple.first) // 1.0
    println(triple.second) // ABC
    println(triple.third) // true

    val (double, string, bool) = triple
    println(double) // 1.0
    println(string) // ABC
    println(bool) // true
}