package cs171.sum2023.lab4.Polymorphism;


public class Cat extends Animal {
    Cat() {
        super("cat");
    }

    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}
