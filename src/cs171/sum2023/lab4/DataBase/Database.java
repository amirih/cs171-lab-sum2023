package cs171.sum2023.lab4.DataBase;
public abstract class Database {
    // Method to connect to the database
    public abstract void connect();

    // Method to disconnect from the database
    public abstract void disconnect();

    // Method to execute a SQL query
    public abstract void executeQuery(String query);
}
