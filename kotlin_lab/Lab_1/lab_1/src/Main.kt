import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Válaszd ki, melyik feladatot szeretnéd futtatni (1-9):")
    val choice = scanner.nextInt()

    when (choice) {
        1 -> {
            println("1. feladat: Két szám összeadása és kiírása string sablonnal")
            sumAndPrint(2, 3)
        }
        2 -> {
            println("2. feladat: Hét napjai lista és szűrések")
            printDaysOfWeek()
        }
        3 -> {
            println("3. feladat: Prímszám ellenőrzése és prímek kiírása egy tartományban")
            printPrimeNumbersInRange(1..100)
        }
        4 -> {
            println("4. feladat: Kódoló és dekódoló függvények")
            val message = "Hello"
            val encoded = messageCoding(message, ::encode)
            val decoded = messageCoding(encoded, ::decode)
            println("Encoded: $encoded, Decoded: $decoded")
        }
        5 -> {
            println("5. feladat: Páros számok kiírása listából szűréssel")
            printEvenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
        }
        6 -> {
            println("6. feladat: Listák transzformálása map() függvénnyel")
            transformLists()
        }
        7 -> {
            println("7. feladat: Mutable lista módosítása")
            modifyMutableList()
        }
        8 -> {
            println("8. feladat: Tömb generálása és elemzése")
            analyzeRandomArray()
        }
        9 -> {
            println("9. feladat: Anagrammák csoportosítása")
            val anagrams = listOf("eat", "tea", "tan", "ate", "nat", "bat")
            println(groupAnagrams(anagrams))
        }
        else -> {
            println("Érvénytelen választás. Kérlek, adj meg egy számot 1 és 9 között!")
        }
    }
}

// 1. Feladat: Két érték összeadása és kiírása string sablonnal
fun sumAndPrint(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

// 2. Feladat: Hét napjai lista és szűrések
fun printDaysOfWeek() {
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    // For loop, ami kiírja a napokat
    for (day in daysOfWeek) {
        println(day)
    }

    // Napok, amelyek 'T'-vel kezdődnek
    println("Days starting with 'T': ${daysOfWeek.filter { it.startsWith('T') }}")

    // Napok, amelyek tartalmazzák az 'e' betűt
    println("Days containing 'e': ${daysOfWeek.filter { it.contains('e') }}")

    // Napok, amelyek hossza 6
    println("Days with length 6: ${daysOfWeek.filter { it.length == 6 }}")
}

// 3. Feladat: Prímszám ellenőrzése és prímek kiírása egy tartományban
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun printPrimeNumbersInRange(range: IntRange) {
    println("Prime numbers in range:")
    range.filter { isPrime(it) }.forEach { println(it) }
}

// 4. Feladat: Kódoló és dekódoló függvények
fun encode(msg: String): String {
    return msg.map { it + 1 }.joinToString("")
}

fun decode(msg: String): String {
    return msg.map { it - 1 }.joinToString("")
}

fun messageCoding(msg: String, func: (String) -> String): String {
    return func(msg)
}

// 5. Feladat: Páros számok kiírása listából szűréssel
fun printEvenNumbers(numbers: List<Int>) {
    numbers.filter { it % 2 == 0 }.forEach { println(it) }
}

// 6. Feladat: Listák transzformálása map() függvénnyel
fun transformLists() {
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val numbers = listOf(1, 2, 3, 4, 5)

    // Elemszorzás kettővel
    println(numbers.map { it * 2 })

    // Napok nagybetűvel
    println(daysOfWeek.map { it.uppercase() })

    // Napok első karaktere nagybetűvel
    println(daysOfWeek.map { it.first().uppercaseChar() })

    // Napok hossza
    println(daysOfWeek.map { it.length })

    // Átlagos hosszúság
    println("Average length: ${daysOfWeek.map { it.length }.average()}")
}

// 7. Feladat: Mutable lista módosítása
fun modifyMutableList() {
    val daysOfWeek = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    // Napok eltávolítása, amelyek tartalmazzák az 'n' betűt
    daysOfWeek.removeAll { it.contains('n') }
    println(daysOfWeek)

    // Lista kiírása indexekkel
    daysOfWeek.withIndex().forEach { println("Item at ${it.index} is ${it.value}") }

    // Lista rendezése
    println(daysOfWeek.sorted())
}

// 8. Feladat: Tömb generálása és elemzése
fun analyzeRandomArray() {
    val randomNumbers = IntArray(10) { (0..100).random() }

    // Elemek kiírása
    randomNumbers.forEach { println(it) }

    // Rendezés növekvő sorrendben
    println(randomNumbers.sorted())

    // Páros számok keresése
    println("Contains any even number: ${randomNumbers.any { it % 2 == 0 }}")
    println("All numbers are even: ${randomNumbers.all { it % 2 == 0 }}")

    // Átlag kiszámítása
    println("Average: ${randomNumbers.average()}")
}

// 9. Extra feladat: Anagrammák csoportosítása
fun groupAnagrams(words: List<String>): List<List<String>> {
    return words.groupBy { it.toCharArray().sorted() }.values.toList()
}
