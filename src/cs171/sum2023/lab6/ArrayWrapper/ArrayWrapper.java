package cs171.sum2023.lab6.ArrayWrapper;

public class ArrayWrapper<T> {
    private T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }
}
