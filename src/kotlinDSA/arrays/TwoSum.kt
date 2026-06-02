package kotlinDSA.arrays

fun main() {
    val sum = 14
    val array = intArrayOf(2, 4, 6, 8, 9)
    val map = mutableMapOf<Int, Int>()

    for (i in array.indices) {
        val result = sum - array[i]
        if (map.containsKey(result)) {
            print("${array[i]} $result")

        } else {
            map[array[i]] = i
        }
    }
}