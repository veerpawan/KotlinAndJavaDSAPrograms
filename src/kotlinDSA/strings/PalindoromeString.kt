package kotlinDSA.strings

fun main() {


    val name = "naman"
    val charArray = name.toCharArray()

    var start = 0
    var end = charArray.size - 1
    while (start < end) {
        val temp = charArray[start]
        charArray[start] = charArray[end]
        charArray[end] = temp
        start++
        end--
    }
    var newString = String(charArray)

    if (name == newString) {
        print("palindorom")
    } else {
        print("now palindorom")
    }

}