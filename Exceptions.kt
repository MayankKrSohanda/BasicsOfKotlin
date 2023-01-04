@file:Suppress("UNREACHABLE_CODE")

import java.lang.NumberFormatException

class MyError : Throwable("Some message")

fun someFunction() {
    throw MyError()
    println("Will not be printed")
}

fun findClusters(number: Int) {
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot be smaller than 1, it is $number")
    // ...
}

var userName = ""

fun printUserName() {
    if (userName == "") throw IllegalStateException("User name must not be empty")
    // ...
}

fun main() {
    try {
        val num: Int = "ABC".toInt()
        println(num)
    } catch (exception: NumberFormatException) {
        println("Caught NumberFormatException")
        println("Caught ${exception.message}")
//        exception.printStackTrace()
    } catch (exception: ArithmeticException) {
        println("Caught ArithmeticException")
    } catch (exception: Throwable) {
        println("Caught $exception")
    }


    try {
        someFunction()
        println("Will not be printed")
    } catch (e: Throwable) {
        println("Caught $e") // Caught MyError: Some message
    }

    try {
        println("This will be printed")
    } finally {
        println("Finally block was called")
    }

    try {
        findClusters(0)
    } catch (e: IllegalArgumentException) {
        println("Caught \"${e.message}\"")
    }

    try {
        printUserName()
    } catch (e: IllegalStateException) {
        println("Caught \"${e.message}\"")
    }
    
    println("Done")
}