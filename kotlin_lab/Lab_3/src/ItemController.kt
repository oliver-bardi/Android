import java.util.Scanner

class ItemController(private val itemService: ItemService) {
    private val scanner = Scanner(System.`in`)

    fun startQuiz(questionCount: Int) {
        val questions = itemService.getRandomItems(questionCount)
        var correctAnswers = 0

        for (question in questions) {
            println(question.question)
            question.answers.forEachIndexed { index, answer ->
                println("${index + 1}. $answer")
            }

            print("Your answer (1-${question.answers.size}): ")
            val userAnswer = scanner.nextInt() - 1

            if (userAnswer == question.correctAnswerIndex) {
                println("Correct!")
                correctAnswers++
            } else {
                println("Wrong! The correct answer is: ${question.answers[question.correctAnswerIndex]}")
            }
            println()
        }

        println("Quiz finished! You got $correctAnswers out of $questionCount correct.")
    }
}
