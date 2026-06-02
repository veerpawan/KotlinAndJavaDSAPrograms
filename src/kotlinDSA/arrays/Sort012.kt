package kotlinDSA.arrays

fun main() {

    val array = intArrayOf(0, 2, 1, 0, 2, 1)

    var start = 0
    var mid = 0
    var end = array.size - 1

    while (mid <= end) {

        when(array[mid]) {
            0 -> {
               val temp = array[start]
               array[start] = array[mid]
               array[mid] = temp
                start++
                mid++
            }
            1->{
                mid++
            }
            2->{
                val temp = array[mid]
                array[mid] = array[end]
                array[end] = temp
                end--
            }

        }

    }
    println(array.joinToString())
}