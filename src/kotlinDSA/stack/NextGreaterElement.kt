package kotlinDSA.stack

import java.util.Stack

//fun main(){
//
//    val array = intArrayOf(4, 5, 2, 10, 8)
//    for(i in array.indices){
//        for(j in i..array.size-1){
//            if(array[j]> array[i]){
//                println(""+array[i]+"   ----"+array[j])
//                break
//            }
//        }
//    }
//}


fun nextGreaterElement(arr: IntArray) {

    val stack = Stack<Int>()

    val result = IntArray(arr.size) { -1 }

    for (i in arr.indices.reversed()) {

        while (stack.isNotEmpty() && stack.last() <= arr[i]) {

            stack.removeLast()

        }

        if (stack.isNotEmpty()) {

            result[i] = stack.last()

        }

        stack.addLast(arr[i])

    }

    for (i in arr.indices) {

        println("${arr[i]} -> ${result[i]}")

    }

}

fun main() {

    val arr = intArrayOf(4, 5, 2, 10, 8)

    nextGreaterElement(arr)

}