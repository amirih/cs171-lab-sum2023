package cs171.sum2023.lab7.Undo;

import java.util.Stack;

public class UndoMoreSolution {
    private Stack<Integer> valuesStack = new Stack<>();
    private Stack<String> operationsStack = new Stack<>();

    public void add(int value) {
        if (!valuesStack.isEmpty()) {
            value += valuesStack.peek();
        }
        operationsStack.push("add");
        valuesStack.push(value);
    }

    public void subtract(int value) {
        if (!valuesStack.isEmpty()) {
            value = valuesStack.peek() - value;
        }
        operationsStack.push("subtract");
        valuesStack.push(value);
    }

    public void multiply(int value) {
        if (!valuesStack.isEmpty()) {
            value *= valuesStack.peek();
        }
        operationsStack.push("multiply");
        valuesStack.push(value);
    }

    public void divide(int value) {
        if (!valuesStack.isEmpty() && value != 0) {
            value = valuesStack.peek() / value;
        }
        operationsStack.push("divide");
        valuesStack.push(value);
    }

    public void undo() {
        if (!operationsStack.isEmpty()) {
            operationsStack.pop();
            valuesStack.pop();
        }
    }

    public int current() {
        if (!valuesStack.isEmpty()) {
            return valuesStack.peek();
        }
        return 0;
    }

    public static void main(String[] args) {
        UndoMoreSolution undoExample = new UndoMoreSolution();

        undoExample.add(5);
        System.out.println(undoExample.current()); //prints: 5

        undoExample.subtract(2);
        System.out.println(undoExample.current()); //prints: 3

        undoExample.multiply(2);
        System.out.println(undoExample.current()); //prints: 6

        undoExample.divide(2);
        System.out.println(undoExample.current()); //prints: 3

        undoExample.undo();
        System.out.println(undoExample.current()); //prints: 6

        undoExample.undo();
        System.out.println(undoExample.current()); //prints: 3

        undoExample.undo();
        System.out.println(undoExample.current()); //prints: 5

        undoExample.undo();
        System.out.println(undoExample.current()); //prints: 0
    }
}
