package cs171.sum2023.lab9.ReverseString;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World!";
        String reversed = reverseString(str);
        System.out.println(reversed);  // Outputs: "!dlroW olleH"
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        String reversed = "";
        // Push all characters of the string onto the stack
        // you can use str.charAt() to get characters

        // Pop the characters from the stack into a new string


        return reversed;
    }
}
