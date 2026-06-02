package kotlinDSA.arrays

fun main(){
    val array1 = intArrayOf(1,2,3,4,5,6,7)
    val array2 = intArrayOf(4,5,6,8,9)

    val set1 = array1.toHashSet()

    //print(set1.joinToString())

    val resultArray = mutableListOf<Int>()


    for(i in array2){
        if(set1.contains(i)){
            resultArray.add(i)
        }
    }

    print(resultArray.joinToString())
}