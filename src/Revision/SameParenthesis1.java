package arrays;

import java.util.Stack;

public class SameParenthesis1 {

    static boolean isValidParanthesis(String s) {

        if (s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (val == '(' || val == '{' || val == '[') {
                stack.push(val);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char peek = stack.peek();
                if (peek == '(' && val != ')') {
                    return false;
                } else if (peek == '{' && val != '}') {
                    return false;
                } else if (peek == '[' && val != ']') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        String braces = "[{}][]";

        System.out.println(isValidParanthesis(braces));
    }
}

