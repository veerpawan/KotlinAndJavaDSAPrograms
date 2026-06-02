package kotlinDSA.arrays

fun main() {

    val array = intArrayOf(1, -2, 3, 4, -7, 5)

    var currentSum = array[0]
    var maxSum = array[0]

    for (i in 1 until array.size) {

        currentSum = maxOf(array[i], currentSum + array[i])
        maxSum = maxOf(maxSum, currentSum)
    }

    println("Maximum Subarray Sum = $maxSum")
}