fun forLoopsTask1() {
    val a = 0
    val b = 5
    for (i in a..b step 1) {
        println(i)
    }
    println()
}

fun forLoopsTask2() {
    val a = 0
    val b = 5
    for (i in a until b) {
        println(i)
    }
    println()
}

fun forLoopsTask3() {
    val a = 5
    val b = 0
    for (i in a downTo b step 2) {
        println(i)
    }
    println()
}

fun forLoopsTask4() {
    val a = 5
    val b = 0
    for (i in a downTo b + 1) {
        println(i)
    }
    println()
}

fun main() {
    forLoopsTask1()
    forLoopsTask2()
    forLoopsTask3()
    forLoopsTask4()
}