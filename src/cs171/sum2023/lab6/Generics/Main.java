package cs171.sum2023.lab6.Generics;

public class Main {

    public static void main(String[] args) {
        SimpleBox<Integer> integerSimpleBox = new SimpleBox<Integer>();
//        Box<Integer> integerBox = new Box<>();

        SimpleBox<String> stringSimpleBox = new SimpleBox<String>();
//        Box<String> stringBox = new Box<>();

        integerSimpleBox.set(10);
        stringSimpleBox.set(new String("Hello World"));

        System.out.println("Integer Value: " + integerSimpleBox.get());
        System.out.println("String Value: " + stringSimpleBox.get());

        ComplexBox<Integer, String> complexBox = new ComplexBox<Integer, String>(10, "Hello");
        System.out.println("Integer Value: " + complexBox.getFirst());
        System.out.println("String Value: " + complexBox.getSecond());

        complexBox.print(10);
        complexBox.print("Hello World");
        complexBox.print(10.0);
        complexBox.print(10.0f);

        complexBox.print(integerSimpleBox.getClass());
        complexBox.print(stringSimpleBox.get());


        ComplexBox<Integer, SimpleBox<String>> complexBox2 = new ComplexBox<Integer, SimpleBox<String>>(10, stringSimpleBox);
        System.out.println(stringSimpleBox.equals(complexBox));
        System.out.println("Integer Value: " + complexBox2.getFirst());
        System.out.println("String Value: " + complexBox2.getSecond().get());
        complexBox2.print(complexBox2.getSecond().get());






    }
}
