package kotlinDSA.`hashset-hasmap`

fun main(){

    val array = intArrayOf(4, 4, 3, 5, 6, 7, 8, 2, 3, 4, 5, 6)

    val map = mutableMapOf<Int, Int>()

    for (i in array.indices) {
        if (map.containsKey(array[i])) {
            map[array[i]] = (map[array[i]] ?: 0) + 1
        } else {
            map[array[i]] = 1
        }
    }

    for ((key, value) in map) {
        println(" $key $value")
    }
}