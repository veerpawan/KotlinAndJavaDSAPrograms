fun main() {
    val arr = intArrayOf(2, 4, 5, 7, 9)
    val target = 2;
    println(check(arr, target))

}

fun check(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        //if (arr[i] == target) {
            print("$i ")
            //return i
        //}
    }
    return -1;
}

