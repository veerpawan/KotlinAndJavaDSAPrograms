package kotlinSample

fun main() {
    fun String.appendValue(): String {
        return this + "Pawan"
    }
    println("Hey".appendValue())
    fun Int.getPositiveNumber(): Int {

        if (this < 0) {
            return 0
        } else {
            return this
        }
    }
    println((-4).getPositiveNumber())
    println((67).getPositiveNumber())
}