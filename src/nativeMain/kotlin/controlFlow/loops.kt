package controlFlow

fun forExample() {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

fun whilesExample() {
    fun eatACake() = println("Eat a cake")
    fun bakeACake() = println("Bake a cake")

    fun main() {
        var cakesEaten = 0
        var cakesBaked = 0

        while (cakesEaten < 5) {
            eatACake()
            cakesEaten++
        }

        do {
            bakeACake()
            cakesBaked++
        } while (cakesBaked < cakesEaten)
    }
    main()
}

fun iterators() {
    class Animal(val name: String)

    class Zoo(val animals: List<Animal>) {
        operator fun iterator(): Iterator<Animal> {
            return animals.iterator()
        }
    }

    fun main() {
        val zoo = Zoo(listOf(Animal("Zebra"), Animal("lion")))

        for (animal in zoo) {
            println("Watch out, it's a ${animal.name}")
        }
    }
}

fun loops() {
    forExample()
    whilesExample()
}