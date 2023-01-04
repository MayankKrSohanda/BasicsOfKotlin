class UserName(
    val name: String
) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

fun printUserName(user: UserName?) {

    // Safe call
    println(user?.name)
    user?.cheer()

    // Not null assertion: Not Safe, throws NullPointer Exception
    try {
        println(user!!.name)
        user.cheer()
    } catch (e: NullPointerException) {
        println(e)
    }

    // Smart Casting
    // 1.
    if (user != null) {
        println(user.name)
        user.cheer()
    } else {
        println(null)
    }
    // 2.
    if (user == null) {
        println(null)
    } else {
        println(user.name)
        user.cheer()
    }


    // Elvis Operator
    val userWithDefault = user ?: UserName("undefined")
    println(userWithDefault.name)
    userWithDefault.cheer()
}

fun main() {
    printUserName(UserName("Jake"))
    println("***")
    printUserName(null)
}