package cs171.sum2023.lab6.Bonus;
public class Stack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = (T[]) new Object[maxSize]; // We need to use an array of objects since we cannot instantiate an array of generic type directly
        top = -1;
    }

    public void push(T value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is full. Can't push " + value);
        }
    }

    public T pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public T peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
