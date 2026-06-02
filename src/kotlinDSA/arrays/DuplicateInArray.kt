package kotlinDSA.arrays

fun main(){

    val array = intArrayOf(5,5,5,5,5,4,6,6,6,9)
    val map = mutableMapOf<Int, Int>()

    for(i in array){
        map[i] = (map[i]?:0)+1
    }

    for((key, value) in map){
        if(value>1){
            print("$key-$value  ")
        }
    }
}