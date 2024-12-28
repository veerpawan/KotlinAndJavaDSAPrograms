package kotlin.strings



/*Problem: Determine if a string can be rearranged to form a palindrome.
Solution: Use a HashSet to track character frequencies.*/
fun main() {

    println(canFormPalindrome("civic"))   // Output: true
    println(canFormPalindrome("ivicc"))   // Output: true
    println(canFormPalindrome("hello"))   // Output: false

}

fun canFormPalindrome(input: String): Boolean {
    val charSet = mutableSetOf<Char>()

    for (char in input) {
        if (char in charSet) {
            charSet.remove(char)
        } else {
            charSet.add(char)
        }
    }

    return charSet.size <= 1
}


