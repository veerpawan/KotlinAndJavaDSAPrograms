package kotlinDSA.strings

fun main(){
    val name = "pawan"

    val strValue = name.toCharArray()
    var start = 0
     var end =strValue.size -1

    while(start<end){
        val temp = strValue[start]
        strValue[start]  = strValue[end]
        strValue[end] = temp
        start++
        end--
    }
    print(strValue.joinToString()+ " ")
}