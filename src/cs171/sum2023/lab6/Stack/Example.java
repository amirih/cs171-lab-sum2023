package cs171.sum2023.lab6.Stack;

import java.util.Stack;

public class Example {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                // This is an opening bracket, push it to the stack
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // This is a closing bracket, check if the stack is empty
                if (stack.isEmpty()) {
                    return false;
                }
                // Check if the closing bracket matches with the top element of the stack
                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        // If there are unmatched opening brackets in the stack, the expression is not balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("}")); // true
        System.out.println(isBalanced("{[()]()}")); // false
        System.out.println(isBalanced("{{[[(())]]}}")); // true
    }
}
