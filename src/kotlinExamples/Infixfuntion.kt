package kotlinExamples

class Infixfuntion {

    infix fun addString(value: String) {
        println(value)
    }
}

fun main() {
    val infixfuntion = Infixfuntion()

    infixfuntion addString "pawan soni"

}