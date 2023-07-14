package cs171.sum2023.Lab5.BookAPI;

public class BookAPI {
    public Object getBook(String id) {

        // In a real application, this method would query a database

        String title = "A Brief History of Time";
        String author = "Stephen Hawking";
        int year = 1988;

        return new Book(title, author, year);
    }
}
