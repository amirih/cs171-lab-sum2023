package cs171.sum2023.lab6.Generics;

public class ComplexBox<T1, T2> {
    private T1 firstItem;
    private T2 secondItem;

    public ComplexBox(T1 firstItem, T2 secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T1 getFirst() {
        return firstItem;
    }

    public T2 getSecond() {
        return secondItem;
    }

    // A generic method
    public <U> void print(U u) {
        System.out.println("The input parameter is: " + u);
    }
}

