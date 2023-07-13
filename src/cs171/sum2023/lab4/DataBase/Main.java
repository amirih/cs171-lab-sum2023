package cs171.sum2023.lab4.DataBase;
public class Main {
    public static void main(String[] args) {
        // Create a PostgresDatabase object
        PostgresDatabase postgres = new PostgresDatabase();

        // Use the PostgresDatabase object to connect to the database
        postgres.connect();

        // Start a transaction
        postgres.startTransaction();

        // Execute a SQL query
        postgres.executeQuery("SELECT * FROM users;");

        // Commit the transaction
        postgres.commit();

        // Disconnect from the database
        postgres.disconnect();
    }
}
