package kotlinDSA.bitmanipulation


fun main() {
    val arr = intArrayOf(4, 4, 5, 1,  6, 5, 6)
    var result = 0
    for (num in arr) {
       //print(num)
        result = result xor num
    }
    print(result)
}