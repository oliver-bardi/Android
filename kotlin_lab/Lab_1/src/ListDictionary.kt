import java.io.File

object ListDictionary : IDictionary {

    private val words = mutableListOf<String>()

    init {
        File(IDictionary.DICTIONARY_NAME).forEachLine { add(it) }
        //mockDictionaryData()
    }

    override fun add(word: String) = words.add(word)

    //override fun find(word: String) = words.find { it == word } != null
    override fun find(word: String) = words.contains(word)


    override fun size() = words.size

}