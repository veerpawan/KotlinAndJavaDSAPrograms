package geeksforgeeks



    fun main(){

        val arr = intArrayOf(2,4,5,6,7)

        for(i in arr.indices){
            print(i)
            if(arr[i] == 6){
                print(i)
            }
        }
    }
