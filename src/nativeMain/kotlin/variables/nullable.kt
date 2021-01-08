package variables

fun nullable() {
    var neverNull: String = "This can't be null"
    //Gera erro
//    neverNull = null
    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNul = "The compiler assumes non-null"
    // Gera erro
//    inferredNonNul = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
    // Gera erro
//    strLength(nullable)
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}