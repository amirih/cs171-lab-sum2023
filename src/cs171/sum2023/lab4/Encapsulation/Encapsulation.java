package cs171.sum2023.lab4.Encapsulation;

public class Encapsulation {
    private String name;

    public Encapsulation(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation("John");
        System.out.println(e.getName());
        e.setName("Jane");
        System.out.println(e.getName());
    }


}
