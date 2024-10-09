import java.io.File
import java.util.*

object HashSetDictionary : IDictionary{
    private val words = HashSet<String>()

    init {
        File(IDictionary.DICTIONARY_NAME).forEachLine { add(it) }
        //mockDictionaryData()
    }

    override fun add(word: String) = words.add(word)

    //override fun find(word: String) = words.find { it == word } != null
    override fun find(word: String) = words.contains(word)


    override fun size() = words.size
}