data class Date(val year: Int, val month: Int, val day: Int) : Comparable<Date> {
    override fun compareTo(other: Date): Int {
        return when {
            this.year != other.year -> this.year - other.year
            this.month != other.month -> this.month - other.month
            else -> this.day - other.day
        }
    }
}

fun Date.isLeapYear(): Boolean {
    return (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)
}

fun Date.isValid(): Boolean {
    if (this.month !in 1..12 || this.day !in 1..31) return false
    if (this.month == 2 && this.day > if (this.isLeapYear()) 29 else 28) return false
    if (this.month in listOf(4, 6, 9, 11) && this.day > 30) return false
    return true
}

fun generateRandomDates(): List<Date> {
    val validDates = mutableListOf<Date>()

    while (validDates.size < 10) {
        val randomDate = Date((1900..2023).random(), (1..12).random(), (1..31).random())
        if (randomDate.isValid()) {
            validDates.add(randomDate)
        } else {
            println("Invalid date: $randomDate")
        }
    }

    return validDates
}

fun printSortedDates(dates: List<Date>) {
    // Rendezés természetes sorrend szerint
    val sortedDates = dates.sorted()
    println("Sorted dates:")
    sortedDates.forEach { println(it) }

    // Fordított sorrend
    val reversedDates = sortedDates.reversed()
    println("Reversed dates:")
    reversedDates.forEach { println(it) }

    // Egyéni rendezés hónap alapján
    val customSortedDates = dates.sortedWith(compareBy { it.month })
    println("Custom sorted dates (by month):")
    customSortedDates.forEach { println(it) }
}