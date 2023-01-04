class Comment(
    val userId: Int, val message: String
)

val comments: List<Comment> = listOf(
    Comment(5241, "Nice code"),
    Comment(6624, "Like it"),
    Comment(5224, "What's going on?"),
    Comment(9001, "Check out my website"),
    Comment(8818, "Hello everyone, :)")
)

val blockedUserIds: Set<Int> = setOf(
    5224, 9001
)

val userIdToRelation: Map<Int, String> = mapOf(
    5241 to "Friend", Pair(6624, "Work Colleague")
)

fun main() {
    for (comment in comments) {
        if (comment.userId !in blockedUserIds) {
            val relation = userIdToRelation[comment.userId] ?: "unknown"
            println("Comment: ${comment.message} from $relation")
        }
    }
}