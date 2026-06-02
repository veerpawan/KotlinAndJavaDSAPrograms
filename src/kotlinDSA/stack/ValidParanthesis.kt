package kotlinDSA.stack

import java.util.Stack

fun main() {
    val param1 = "(){}[]"
    val param2 = "(){}[)"
    val param3 = "({[]})"
    val param4 = "(){}[])"
    val param5 = ""

    println(checkValidParenthesis(param1))
    println(checkValidParenthesis(param2))
    println(checkValidParenthesis(param3))
    println(checkValidParenthesis(param4))
    println(checkValidParenthesis(param5))

}

fun checkValidParenthesis(str: String): Boolean {
    if (str.isEmpty()) {
        return false
    }
    val stack = Stack<Char>()

    for (char in str) {
        when (char) {
            '{', '(', '[' -> stack.push(char)
            ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
            ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
            '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
        }
    }
    return stack.isEmpty()
}