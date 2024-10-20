fun main() {
    // 1. Dictionary tesztelése
    val dict = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST)
    dict.add("pineapple")
    println("Dictionary size: ${dict.size()}")
    println("Find 'apple': ${dict.find("apple")}")
    println("Find 'mango': ${dict.find("mango")}")

    // 2. Kiterjesztett függvények tesztelése
    println("Monogram: ${"John Smith".getMonogram()}")
    println(listOf("apple", "banana", "cherry").joinBySeparator("#"))
    println("Longest string: ${listOf("apple", "banana", "strawberry").findLongest()}")

    // 3. Dátum generálás és rendezés
    val randomDates = generateRandomDates()
    printSortedDates(randomDates)

    // 4. Szöveg generálás
    val text = "Now is not the time for sleep, now is the time for party!"
    val textGenerator = TextGenerator()
    textGenerator.learnWords(text)
    println("Generated text: ${textGenerator.generateText()}")
}
