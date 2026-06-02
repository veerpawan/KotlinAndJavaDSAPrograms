package kotlinDSA.arrays

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)
    val k = 2
    val end = array.size - 1
    reverseArray(0, array.size - 1, array)
    reverseArray(0, k - 1, array)
    reverseArray(k, end, array)
    println(array.joinToString())
}

fun reverseArray(start: Int, end: Int, array: IntArray) {
    var start = start
    var end = end
    while (start < end) {
        val temp = array[start]
        array[start] = array[end]
        array[end] = temp
        start++
        end--
    }
}