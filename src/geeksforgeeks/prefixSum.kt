package geeksforgeeks

fun main(){


    val arr = intArrayOf(-7,1,5,2,-4,3,0)

    var totalSum =0;
    var rightSum = 0;
    var leftSum =0;

    for(i in arr.indices){
        totalSum += arr[i]
        println(totalSum)
        rightSum = totalSum
    }

    for(value in arr.indices){
        
    }
}