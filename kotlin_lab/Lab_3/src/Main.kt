import java.util.*

fun main() {
    val repository = ItemRepository()
    val service = ItemService(repository)
    val controller = ItemController(service)

    println("Welcome to the Kotlin Quiz!")
    print("How many questions would you like to answer? ")

    val scanner = Scanner(System.`in`)
    val questionCount = scanner.nextInt()

    controller.startQuiz(questionCount)
}
