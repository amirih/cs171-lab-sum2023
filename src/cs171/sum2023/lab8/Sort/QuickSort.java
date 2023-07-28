package cs171.sum2023.lab8.Sort;
public class QuickSort {
    int partition(int arr[], int low, int high) {
        // TODO: implement by your self and look at my screen
        return 0;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is
            // now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Unsorted array");
        printArray(arr);
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}
