package collections

val numbers = listOf(1, -2, 3, -4, 5, -6)

fun any() {
    val anyNegative = numbers.any { it < 0 }

    val anyGT6 = numbers.any { it > 6 }
}

fun all() {
    val allEven = numbers.all { it % 2 == 0 }

    val allLess6 = numbers.all { it < 6 }
}

fun none() {
    val allEven = numbers.none { it % 2 == 1 }

    val allLess6 = numbers.none { it > 6 }
}