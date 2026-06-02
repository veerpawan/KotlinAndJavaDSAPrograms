package kotlinDSA.arrays

fun main() {
    val array = intArrayOf(1, 0, 3, 0, 5)
    var index = 0

    for (i in array.indices) {
        if (array[i] != 0) {
            array[index] = array[i]
            index++
        }
    }
    while(index<array.size){
        array[index] = 0
        index++
    }
    println(array.joinToString())
}