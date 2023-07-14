package cs171.sum2023.Lab5.Boxing;

public class Numbers {

    public static void main(String[] args) {

        float floatNumber = 1234.56F;
        float anotherFloatNumber=789.123F;
        int intNumber = 345;

        Float floatNumberBox = floatNumber;
        Float anotherFloatNumberBox = anotherFloatNumber;
        Integer intNumberBox = intNumber;

        System.out.println(floatNumberBox.compareTo(anotherFloatNumber));

        int result = floatNumberBox.intValue() + anotherFloatNumberBox.intValue() + intNumber;

        System.out.println(result);




    }

}
