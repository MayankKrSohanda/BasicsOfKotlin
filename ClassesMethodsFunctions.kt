 class Player(
     val name: String, val surName: String
 ) {
     var totalScore = 0
     var personalBestScore = 0

     fun fullName(): String {
        return "$name $surName"
     }
 }

 class Scores {
     fun checkBest(best: Int, current: Int): Int {
         if (best < current) {
             return current
         }
         return best
     }
 }

 fun main() {
     val p1 = Player("Nicola", "Tesla")
     val p2 = Player("Thomas", "Edison")

     val scoring = Scores()
     var lvlScore: Int


     // Level 1
     lvlScore = 12
     p1.totalScore += lvlScore
     p1.personalBestScore = scoring.checkBest(p1.personalBestScore, lvlScore)

     lvlScore = 34
     p2.totalScore += lvlScore
     p2.personalBestScore = scoring.checkBest(p2.personalBestScore, lvlScore)


     // Level 2
     lvlScore = 56
     p1.totalScore += lvlScore
     p1.personalBestScore = scoring.checkBest(p1.personalBestScore, lvlScore)

     lvlScore = 78
     p2.totalScore += lvlScore
     p2.personalBestScore = scoring.checkBest(p2.personalBestScore, lvlScore)


     // Level 3
     lvlScore = 99
     p1.totalScore += lvlScore
     p1.personalBestScore = scoring.checkBest(p1.personalBestScore, lvlScore)

     lvlScore = 10
     p2.totalScore += lvlScore
     p2.personalBestScore = scoring.checkBest(p2.personalBestScore, lvlScore)


     if (p1.totalScore > p2.totalScore) {
         println("The winner is " + p1.fullName() + " with a Score of " + p1.totalScore)
         println("Personal Best Score is = " + p1.personalBestScore)
     } else {
         println("The winner is " + p2.fullName() + " with a Score of " + p2.totalScore)
         println("Personal Best Score is = " + p2.personalBestScore)
     }

 }