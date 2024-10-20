
class ListDictionary : IDictionary {
    private val words = mutableListOf<String>()

    init {
        // Szavak inicializálása (akár fájlból is lehetne olvasni)
        words.addAll(listOf("apple", "banana", "orange", "grape", "melon"))
    }

    override fun add(word: String) {
        words.add(word)
    }

    override fun find(word: String): Boolean {
        return words.contains(word)
    }

    override fun size(): Int {
        return words.size
    }
}
