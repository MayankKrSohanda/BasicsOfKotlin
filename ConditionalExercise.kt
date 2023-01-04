fun conditionalTask1() {
    val weekday = "Friday"
    println("On $weekday, the opening hours are:")

    when (weekday) {
        "Monday" -> println("8 AM to 12 PM")
        "Tuesday" -> println("8 AM to 6 PM")
        "Wednesday" -> println("8 AM to 6 PM")
        "Thursday" -> println("8 AM to 6 PM")
        "Friday" -> println("8 AM to 9 PM")
        "Saturday" -> println("9 AM to 4 PM")
        "Sunday" -> println("8 AM to 4 PM")
    }
}

fun conditionalTask2() {
    val weekday = "Friday"
    val hour = 20
    val isOpen = when (weekday) {
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..21
        "Saturday" -> hour in 9..16
        "Sunday" -> hour in 8..16
        else -> false
    }
    if (isOpen) {
        println("Little Lemon is open now")
    } else {
        print("Little Lemon is closed now")
    }
}

fun main() {
    conditionalTask1()
    conditionalTask2()
}