package cs171.sum2023.lab9.PostFix;
import java.util.Stack;


public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "5 2 4 * + 7 -";
        System.out.println("Postfix expression: " + expression);
        System.out.println("Evaluation result: " + evaluatePostfix(expression)); // Outputs 7
    }
}
