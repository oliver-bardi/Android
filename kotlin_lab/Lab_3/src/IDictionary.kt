interface IDictionary {
    fun add(word: String): Boolean
    fun find(word: String): Boolean
    fun size(): Int

    companion object{
        const val DICTIONARY_NAME = "D:\\Egyetem_24_25\\Android\\Labor\\src\\resources\\dict"
    }
}