package classes

class MutableStack<E>(vararg item: E) {
    private val elements = item.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun generics() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}