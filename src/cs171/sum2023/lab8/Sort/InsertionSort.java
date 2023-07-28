package cs171.sum2023.lab8.Sort;
public class InsertionSort {
    void insertionSort(int arr[]) {
        //TODO
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Unsorted array");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.insertionSort(arr);

        printArray(arr);
    }
}
