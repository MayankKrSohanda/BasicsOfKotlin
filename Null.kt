var name: String? = null
var i: Int? = null
var c: Char? = null


class User(
    val name: String?
)

var user: User? = null

fun processUser(user: User?): User? {
    return null
}

fun main() {
    val user = User(null)
    val result: User? = processUser(null)

    var message: String? = "Hello World"
    message = null
    if (message != null) {
        println(message.length)
    } else {
        println(null)
    }

    println(message?.length) // Safe Call
}