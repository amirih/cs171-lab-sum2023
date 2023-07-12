package cs171.sum2023.lab3;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Both ClassA:");
        ClassA objectA = new ClassA();
        objectA.sayName();

        System.out.println("Both ClassB");
        ClassB objectB = new ClassB();
        objectB.sayName();
        objectB.extraMethod();

        System.out.println("Type: ClassA, Instanced: ClassB ");
        ClassA objectAB = new ClassB();
        objectAB.sayName();
//        objectAB.extraMethod();
    }
}
