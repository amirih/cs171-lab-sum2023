package cs171.sum2023.lab4.Abstraction;

// Make Dog implement Eater
class EatingDog extends Dog implements Eater {
    @Override
    public void eat(String food) {
        System.out.println("The dog eats " + food);
    }
}
