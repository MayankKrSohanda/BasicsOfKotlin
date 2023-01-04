fun loopsTask1() {
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }

        println()
    }
}

fun loopsTask2() {
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 11 - i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}

fun loopsTask3() {
    for (i in 1 until 5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = i + 1 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}

fun main() {
    loopsTask1()
    println()
    loopsTask2()
    println()
    loopsTask3()
}