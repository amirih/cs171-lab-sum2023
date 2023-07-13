package cs171.sum2023.lab4.DataBase;
public interface Transaction {
    // Method to start a transaction
    void startTransaction();

    // Method to commit a transaction
    void commit();

    // Method to rollback a transaction
    void rollback();
}
