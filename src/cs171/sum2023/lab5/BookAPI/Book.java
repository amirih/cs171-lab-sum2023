package cs171.sum2023.lab5.BookAPI;
public class Book extends BookAbstract implements Readable, Scanable{
    private Object title;
    private Object author;
    private Object year;

    public Book(Object title, Object author, Object year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Object getTitle() {
        return title;
    }

    public Object getAuthor() {
        return author;
    }

    public Object getYear() {
        return year;
    }


    @Override
    public void nextPage() {
        System.out.println("Next page");
    }

    @Override
    public void previousPage() {
        System.out.println("Previous page");
    }
    @Override
    public void read() {
        readingStarted();
        System.out.println("Reading book ...");
        readingFinished();
    }

    @Override
    public void scan() {
        scanningStarted();
        System.out.println("Scanning book...");
        scanningFinished();
    }

    @Override
    public void scanNextPage() {
        System.out.println("Scanning next page");
    }

    @Override
    public void scanPreviousPage() {
        System.out.println("Scanning previous page");
    }

    @Override
    public void readingStarted() {
        System.out.println("Fast reading started");
    }
}
