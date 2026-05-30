package kotlinDSA.kotlinClasses

fun main() {

    val result = add(a = 2, b = 5) { c, d ->
        c.plus(d)
    }
    print(result)



}

fun add(a: Int, b: Int, c: (Int, Int) -> Int): Int {

    return c.invoke(a, b)

}