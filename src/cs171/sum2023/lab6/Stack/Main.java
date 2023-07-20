package cs171.sum2023.lab6.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<String>();

        // Adding items to the Stack
        stack.push("Java");
        stack.push("is");
        stack.push("awesome!");

        // Printing the top item of the Stack
        System.out.println("Top of stack: " + stack.peek());

        // Removing the top item from the Stack
        System.out.println("Popped from stack: " + stack.pop());

        // Printing the top item of the Stack
        System.out.println("Top of stack: " + stack.peek());
    }
}
