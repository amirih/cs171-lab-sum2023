package cs171.sum2023.lab4.Sort;
public class BubbleSort extends SortAlgorithm implements ArrayPrinter {
    @Override
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Using the swap method from the abstract class
                    swap(array, j, j + 1);
                }
            }
        }
        return array;

    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }
}
