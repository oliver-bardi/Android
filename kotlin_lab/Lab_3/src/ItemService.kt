class ItemService(private val repository: ItemRepository) {

    fun getRandomItems(count: Int): List<Item> {
        val allItems = repository.getAllItems()
        if (count > allItems.size) {
            throw IllegalArgumentException("Requested more items than available in the repository.")
        }
        return allItems.shuffled().take(count)
    }
}