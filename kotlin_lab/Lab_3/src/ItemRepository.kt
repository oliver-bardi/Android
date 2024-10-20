class ItemRepository {
    private val items = mutableListOf<Item>()

    init {
        // Kérdések inicializálása
        items.add(
            Item(
                "What is the capital of France?",
                listOf("Berlin", "Madrid", "Paris", "Rome"),
                2
            )
        )
        items.add(
            Item(
                "Who developed the theory of relativity?",
                listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla"),
                1
            )
        )
        items.add(
            Item(
                "Which planet is known as the Red Planet?",
                listOf("Earth", "Mars", "Jupiter", "Saturn"),
                1
            )
        )
        items.add(
            Item(
                "What is the largest ocean on Earth?",
                listOf("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"),
                3
            )
        )
        items.add(
            Item(
                "Who painted the Mona Lisa?",
                listOf("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"),
                2
            )
        )
        items.add(
            Item(
                "Which country is known as the Land of the Rising Sun?",
                listOf("China", "Japan", "South Korea", "Thailand"),
                1
            )
        )
        items.add(
            Item(
                "What is the hardest natural substance on Earth?",
                listOf("Gold", "Iron", "Diamond", "Silver"),
                2
            )
        )
        items.add(
            Item(
                "Who wrote 'Romeo and Juliet'?",
                listOf("William Shakespeare", "Charles Dickens", "Mark Twain", "J.K. Rowling"),
                0
            )
        )
        items.add(
            Item(
                "What is the smallest prime number?",
                listOf("0", "1", "2", "3"),
                2
            )
        )
        items.add(
            Item(
                "Which element has the chemical symbol 'O'?",
                listOf("Oxygen", "Osmium", "Ozone", "Oxide"),
                0
            )
        )
        items.add(
            Item(
                "In which year did the Titanic sink?",
                listOf("1912", "1914", "1916", "1920"),
                0
            )
        )
    }

    fun getAllItems(): List<Item> {
        return items
    }

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getItemCount(): Int {
        return items.size
    }
}
