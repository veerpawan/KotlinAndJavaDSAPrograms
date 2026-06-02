package kotlinDSA.arrays

fun main() {

    val array = intArrayOf(1, 2, 3, 5, 6, 7)
    val n = array.size + 1

    val sum = (n * (n + 1)) / 2

    print(sum)
    var initialSum = 0

    for (i in array) {
        initialSum += i
    }

    print(initialSum)

    val missingNum = sum -initialSum

    print(missingNum)
}