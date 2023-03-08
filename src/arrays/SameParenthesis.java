package arrays;

import java.util.Stack;

public class SameParenthesis {


    public static boolean checkValidParanthesis(String s) {
        if (s.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < s.length(); i++) {

                char input = s.charAt(i);

                if (input == '[' || input == '{' || input == '(') {
                    stack.push(input);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char popChar = stack.pop();

                    if ((popChar != '{' && input == '}') || (popChar != '[' && input == ']') || popChar != '(' && input == ')') {
                        return false;
                    }

                }
                if (stack.isEmpty()) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String args[]) {
        String value = "[()]{}{[()()]()}";
        System.out.println(checkValidParanthesis(value));
    }
}

