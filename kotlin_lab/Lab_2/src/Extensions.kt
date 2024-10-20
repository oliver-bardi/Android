fun String.getMonogram(): String {
    return this.split(" ").map { it.first().uppercase() }.joinToString("")
}

fun List<String>.joinBySeparator(separator: String): String {
    return this.joinToString(separator)
}

fun List<String>.findLongest(): String {
    return this.maxByOrNull { it.length } ?: ""
}