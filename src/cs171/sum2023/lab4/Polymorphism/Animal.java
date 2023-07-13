package cs171.sum2023.lab4.Polymorphism;

public class Animal {
    String type;

    Animal() {
        this.type = "animal";
    }

    Animal(String type) {
        this.type = type;
    }

    void sound() {
        System.out.println("The animal makes a sound");
    }

    void eat() {
        System.out.println("The " + this.type + " eats");
    }

    void eat(String food) {
        System.out.println("The " + this.type + " eats " + food);
    }

}
