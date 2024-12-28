package kotlin.strings

import java.util.*


/*Problem: Determine if a string has balanced parentheses (e.g., {[()]} is balanced, but {[(])} is not).
Solution: Use a stack to match opening and closing brackets.*/
fun main() {


    // Example
    println(isBalanced("{[()]}"))  // Output: true
    println(isBalanced("{[(])}"))  // Output: false
}

fun isBalanced(input: String): Boolean {
    val stack = ArrayDeque<Char>()
    val matchingBrackets = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in input) {
        if (char in matchingBrackets.values) {
            stack.push(char)
        } else if (char in matchingBrackets.keys) {
            if (stack.isEmpty() || stack.pop() != matchingBrackets[char]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}