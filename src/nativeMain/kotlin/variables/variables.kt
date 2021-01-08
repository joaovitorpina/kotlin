package variables

fun variables() {
    // Pode ter outro valor
    var a: String = "initial"
    println(a)
    // Não pode mudar de valor
    val b: Int = 1
    val c = 3

    var e: Int
    // Causa erro de falta de inicializacao da variavel
    //println(e)

    val d: Int

    if (a == "initial") {
        d = 1
    } else {
        d = 2
    }
    println(d)
}