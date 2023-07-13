package cs171.sum2023.lab4.Polymorphism;

public class Dog extends Animal {

    Dog() {
        super("dog");
    }

    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}
