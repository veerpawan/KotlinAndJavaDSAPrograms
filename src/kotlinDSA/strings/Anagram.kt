package kotlinDSA.strings

fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val charCount = IntArray(26)

    for (i in str1.indices) {
        charCount[str1[i] - 'a']++
        charCount[str2[i] - 'a']--
    }

    for (count in charCount) {
        if (count != 0) {
            return false
        }
    }

    return true
}
fun main() {
    val str1 = "listen"
    val str2 = "silent"
    val areAnagrams = areAnagrams(str1, str2)

    if (areAnagrams) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }
}