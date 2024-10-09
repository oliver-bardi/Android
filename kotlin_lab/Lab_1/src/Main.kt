fun main(){

//    val dict: IDictionary = DictionaryProvider.createDictionary(DictionaryType.HASH_SET)
//    //val dict: IDictionary = DictionaryProvider.createDictionary(DictionaryType.TREE_SET)
//    //val dict: IDictionary = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST)
//
//    println("Number of words: ${dict.size()}")
//    var word: String?
//    while(true){
//        print("What to find? ")
//        word = readLine()
//        if( word.equals("quit")){
//            break
//        }
//        println("Result: ${word?.let { dict.find(it) }}")
//    }

    val name = "John Smith"
    println(name.nameMonogram())

    val element = ""

}

fun String.nameMonogram(): String {
    return this.split(" ").map {it[0]}.joinToString("")
}

fun List<String>.joinElements(separator: String): String = this.joinToString(separator)