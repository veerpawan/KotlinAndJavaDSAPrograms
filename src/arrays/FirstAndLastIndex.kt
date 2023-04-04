package arrays

fun main() {

    val arr: IntArray = intArrayOf(4, 5, 6, 5, 5, 5, 7)


    find(arr)
}

fun find(arr: IntArray) {

    var start = -1;
    var last = -1;
    for (i in arr.indices) {

        if (arr[i] == 5) {
            if (start == -1) {
                start = i;
            }
            last = i;
        }

    }
    println(start)
    println(last)

}
