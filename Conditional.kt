fun main() {
    val probability = 70
    when {
        probability < 40 -> {
            println("Unlikely")
        }

        probability <= 80 -> {
            println("Likely")
        }

        probability < 100 -> println("Yes")

        else -> {
            println("What?")
        }
    }

    val text = when {
        probability < 40 -> {
            "Unlikely"
        }

        probability <= 80 -> {
            "Likely"
        }

        probability < 100 -> "Yes"

        else -> {
            "What?"
        }
    }
    println(text)

    val number = 8
    when (number) {
        1 -> {
            println("Missed hit")
        }

        2, 3, 4, 5 -> println("Hit with value $number")
        6 -> {
            println("Critical hit")
        }

        in 7..10 -> println("Unsupported value")
    }
}