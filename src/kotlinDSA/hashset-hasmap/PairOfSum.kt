package kotlinDSA.`hashset-hasmap`

fun main(){

    val array = intArrayOf(2, 4, 6, 8, 9)

    val target = 14

    val map = mutableMapOf<Int, Int>()


    //brute force
//    for(i in array.indices){
//        for(j in i+1 until array.size){
//            if(array[i]+array[j] == target){
//                print("${array[i]} ${array[j]}")
//                break
//            }
//        }
//    }

    for (i in array.indices) {

        val result = target - array[i]
        if (map.containsKey(result)) {

            print("${array[i]} $result")
        } else {
            map[array[i]] = i
        }
    }

}