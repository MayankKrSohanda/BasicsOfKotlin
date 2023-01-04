fun cheer(how: String = "Hello, ", who: String = "World") {

    println("$how $who")
}

fun main() {

    cheer(how = "Hi ") // Hi World

    cheer(who = "Learner") // Hello, Learner

    cheer(how = "Hi ", who = "Learner") // Hi Learner

    cheer(who = "Learner", how = "Hi ") // Hi Learner
}