
class HashSetDictionary : IDictionary {
    private val words = HashSet<String>()

    init {
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
