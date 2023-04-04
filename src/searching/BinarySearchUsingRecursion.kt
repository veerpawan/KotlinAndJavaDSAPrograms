package searching

object BinarySearchUsingRecursion {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(3, 4, 5, 6, 7, 8, 9)
        val target = 4
        val ans = findElement(arr, target, 0, arr.size - 1)
        println(ans)
    }

    fun findElement(arr: IntArray, target: Int, low: Int, high: Int): Int {
        if (low > high) {
            return -1
        }
        val mid = (low + high) / 2
        if (arr[mid] == target) {
            return mid
        }
        return if (arr[mid] < target) {
            findElement(arr, target, mid + 1, high)
        } else {
            findElement(arr, target, low, mid - 1)
        }
    }
}