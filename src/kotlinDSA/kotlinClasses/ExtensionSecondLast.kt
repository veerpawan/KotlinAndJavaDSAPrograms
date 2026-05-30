package kotlinDSA.kotlinClasses



fun  List<Int>.secondLast(): Int? {
    return if (this.size < 2) null else this[this.size - 2]
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Second last element: ${numbers.secondLast()}") // Output: 4

    val emptyList = listOf<Int>()
    println("Second last element: ${emptyList.secondLast()}") // Output: null
}