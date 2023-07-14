package cs171.sum2023.lab5.TypeCasting;


class UserAPI {
    public Object getUser(String username, String password) {
        // In real-world applications, this is where you would check the username and password,
        // possibly against a database. If they are valid, you would return the corresponding User object.
        // Here, we're skipping that step for simplicity and returning a dummy User object.

        return new User(1, "Alice", 23, "alice@example.com");
    }


    public static void main(String[] args) {
        UserAPI userAPI = new UserAPI();

        // In a real-world application, these would be input by the user
        String username = "alice";
        String password = "password123";

        User user =(User) userAPI.getUser(username, password);

        Integer id = (Integer) user.getId();
        String name = (String) user.getName();
        Integer age = (Integer) user.getAge();
        String email = (String) user.getEmail();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
