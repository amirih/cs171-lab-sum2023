package cs171.sum2023.lab4.Sort;

public class CSort extends SortAlgorithm implements ArrayPrinter{

    @Override
    public void printArray(int[] array) {
        System.out.println("[");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println("]");

    }

    @Override
    public int[] sort(int[] array) {
        for (int i =0; i<array.length; i++)
            for (int j=0; j< array.length; j++){
                if (array[i] < array[j]){
                    swap(array, i, j);
                }

            }
        return array;
    }

    @Override
    public String getName() {
        return "CSort";
    }
}
