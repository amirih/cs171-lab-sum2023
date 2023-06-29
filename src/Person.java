public class Person {

    String name;
    int age;

    Person (){
        this.name ="john";
        this.age = 0;
    }
    Person ( String name){
        this.name=name;
    }
    Person ( String name, int age){
        this.name=name;
        this.age=age;

    }

    public void talk (String input){
        System.out.println("I am " +this.name + " " + input);
    }
}