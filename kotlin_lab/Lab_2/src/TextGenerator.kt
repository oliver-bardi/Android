class TextGenerator {
    private val prefixMap = mutableMapOf<Pair<String, String>, MutableList<String>>()

    fun learnWords(text: String) {
        val words = text.split(" ")
        for (i in 0 until words.size - 2) {
            val prefix = Pair(words[i], words[i + 1])
            val postfix = words[i + 2]
            prefixMap.computeIfAbsent(prefix) { mutableListOf() }.add(postfix)
        }
    }

    fun generateText(): String {
        val result = mutableListOf<String>()
        val initialPrefix = prefixMap.keys.first()
        result.add(initialPrefix.first)
        result.add(initialPrefix.second)

        var currentPrefix = initialPrefix
        while (prefixMap.containsKey(currentPrefix)) {
            val possiblePostfixes = prefixMap[currentPrefix]!!
            val nextWord = possiblePostfixes.random()
            result.add(nextWord)
            currentPrefix = Pair(currentPrefix.second, nextWord)
        }

        return result.joinToString(" ")
    }
}
