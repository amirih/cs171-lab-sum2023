package cs171.sum2023.lab4.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a BubbleSort object
        CSort bubbleSort = new CSort();
        // Define an array to sort
        int[] array = {5, 3, 8, 4, 2};

        // Use the InsertionSort object to sort the array
        int[] sortedArray = bubbleSort.sort(array);

        // Print the sorted array
        System.out.println("Sorted array: ");
        bubbleSort.printArray(sortedArray);

        // Print the name of the sorting algorithm
        System.out.println("Sorting algorithm: " + bubbleSort.getName());

    }
}
