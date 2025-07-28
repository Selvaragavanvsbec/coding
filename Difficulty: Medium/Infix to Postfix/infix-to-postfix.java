import java.util.*;

class Solution {
    public static String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If operand, add to result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If ')', pop till '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            }
            // If operator
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop all remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }
}
