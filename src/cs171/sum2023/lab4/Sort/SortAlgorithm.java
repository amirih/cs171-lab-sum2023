package cs171.sum2023.lab4.Sort;
public abstract class SortAlgorithm {
    // Method to sort the array
    public abstract int[] sort(int[] array);

    // Method to get the name of the sorting algorithm
    public abstract String getName();

    // Utility method for swapping two elements in the array
    protected void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}