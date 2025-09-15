object Isogram {

    fun isIsogram(input: String): Boolean {
        return !input.toLowerCase().filter {it.isLetterOrDigit()}.groupingBy {it}.eachCount().any{it.value > 1}
    }
}
