package kotlinDSA.`hashset-hasmap`

fun main(){

    val array = intArrayOf(10, 5, 3, 4, 3, 5, 6)

    val set = mutableSetOf<Int>()

    var repeatingElement = -1

    for (i in array.size - 1 downTo 0) {
        if (set.contains(array[i])) {
            repeatingElement = array[i]
        } else {
            set.add(array[i])
        }
    }

    print(repeatingElement)

}