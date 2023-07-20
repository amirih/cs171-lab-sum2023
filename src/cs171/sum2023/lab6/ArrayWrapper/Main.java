package cs171.sum2023.lab6.ArrayWrapper;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        Integer[] intArray2 = new Integer[]{6, 7, 8, 9, 10};
        ArrayWrapper<Integer> intArrayWrapper = new ArrayWrapper<>(intArray);

        System.out.println("Third element in integer array: " + intArrayWrapper.getElement(2));
        System.out.println("Integer array[0]: " + intArrayWrapper.getArray()[0]);
        System.out.println("Integer array[1]: " + intArrayWrapper.getArray()[1]);

        intArrayWrapper.setArray(intArray2);

        System.out.println("Third element in integer array: " + intArrayWrapper.getElement(2));
        System.out.println("Integer array[0]: " + intArrayWrapper.getArray()[0]);
        System.out.println("Integer array[1]: " + intArrayWrapper.getArray()[1]);


        String[] strArray = new String[]{"Generics", "in", "Java"};
        String[] strArray2 = new String[]{"are", "awesome", "!"};
        ArrayWrapper<String> strArrayWrapper = new ArrayWrapper<>(strArray);

        System.out.println("Second element in string array: " + strArrayWrapper.getElement(1));
        System.out.println("String array[0]: " + strArrayWrapper.getArray()[0]);
        System.out.println("String array[1]: " + strArrayWrapper.getArray()[1]);

        strArrayWrapper.setArray(strArray2);
        System.out.println("Second element in string array: " + strArrayWrapper.getElement(1));
        System.out.println("String array[0]: " + strArrayWrapper.getArray()[0]);
        System.out.println("String array[1]: " + strArrayWrapper.getArray()[1]);

    }
}
