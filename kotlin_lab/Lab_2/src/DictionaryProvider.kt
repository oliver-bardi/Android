enum class DictionaryType {
    ARRAY_LIST, TREE_SET, HASH_SET
}

object DictionaryProvider {
    private val listDictionary = ListDictionary()
    private val treeSetDictionary = TreeSetDictionary()
    private val hashSetDictionary = HashSetDictionary()

    fun createDictionary(type: DictionaryType): IDictionary {
        return when (type) {
            DictionaryType.ARRAY_LIST -> listDictionary
            DictionaryType.TREE_SET -> treeSetDictionary
            DictionaryType.HASH_SET -> hashSetDictionary
        }
    }
}