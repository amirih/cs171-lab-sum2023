package cs171.sum2023.lab5.BookAPI;

public interface Readable {
    void read();
    void nextPage();
    void previousPage();

    default void readingStarted(){
        System.out.println("Reading started");
    }
    default void readingFinished(){
        System.out.println("Reading finished");
    }

}
