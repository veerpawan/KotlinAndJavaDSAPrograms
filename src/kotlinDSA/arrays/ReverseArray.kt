package kotlinDSA.arrays

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }

    print(arr.joinToString())
}