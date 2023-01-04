enum class PaymentMethod {
    CASH, CARD, CHEQUE
}

fun payWithCash(amount: Double): Boolean {
    println("Paid $amount with Cash")
    return true
}

fun payWithCard(amount: Double): Boolean {
    println("Paid $amount with Card")
    return true
}

fun payWithCheque(amount: Double): Boolean {
    println("Paid $amount with Cheque")
    return true
}

fun pay(amount: Double, method: PaymentMethod): Boolean {
    return when (method) {
        PaymentMethod.CASH -> payWithCash(amount)
        PaymentMethod.CARD -> payWithCard(amount)
        PaymentMethod.CHEQUE -> payWithCheque(amount)
    }
}

enum class PizzaSize(
    val sizeInCm: Int
) {
    SMALL(15), MEDIUM(20), LARGE(25), EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}

fun main() {
    val success = pay(123.0, PaymentMethod.CASH)
    println("Success: $success")
    println(PaymentMethod.CASH)
    
    println(PaymentMethod.CASH.ordinal)
    println(PaymentMethod.CARD.ordinal)
    println(PaymentMethod.CHEQUE.ordinal)

    for (method in PaymentMethod.values()) {
        println("At ${method.ordinal} there is $method")
    }

    val string1 = "CASH"
    val method = PaymentMethod.valueOf(string1)
    println(method)
    val string2 = method.name
    println(string2)

    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm
}

