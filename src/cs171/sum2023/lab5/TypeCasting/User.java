package cs171.sum2023.lab5.TypeCasting;

public class User {
    private Object id;
    private Object name;
    private Object age;
    private Object email;

    public User(Object id, Object name, Object age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public User(Object id, Object name, Object age, Object email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public Object getId() {
        return id;
    }

    public Object getName() {
        return name;
    }

    public Object getAge() {
        return age;
    }

    public Object getEmail() {
        return email;
    }

    public static void main(String[] args) {
        User user = new User(1, "Alice", 25);

        Integer id = (Integer) user.getId();
        String name = (String) user.getName();
        Integer age = (Integer) user.getAge();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        User anotherUser = new User("2", "Bob", "30");
        Integer anotherId = null;
        String anotherName = null;
        Integer anotherAge = null;

        if (anotherUser.getId() instanceof Integer) {
            System.out.println("ID is an Integer");
            anotherId = (Integer) anotherUser.getId();

        } else {
            System.out.println("ID is not an Integer");
        }
        if (anotherUser.getName() instanceof String) {
            System.out.println("Name is a String");
            anotherName = (String) anotherUser.getName();
        } else {
            System.out.println("Name is not a String");
        }

        if (anotherUser.getAge() instanceof Integer) {
            System.out.println("Age is an Integer");
            anotherAge = (Integer) anotherUser.getAge();
        } else {
            System.out.println("Age is not an Integer");
        }

        System.out.println("ID: " + anotherId);
        System.out.println("Name: " + anotherName);
        System.out.println("Age: " + anotherAge);
    }
}

