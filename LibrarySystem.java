// Base Class
class Book {
    String title;
    String author;
    int year;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

// Child Class: PrintedBook
class PrintedBook extends Book {
    int pages;

    // Constructor
    public PrintedBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    // Method to calculate reading time
    public void readingTime() {
        int time = pages * 2; // 1 page = 2 minutes
        System.out.println("Pages: " + pages);
        System.out.println("Reading Time: " + time + " minutes");
    }
}

// Child Class: EBook
class EBook extends Book {
    double fileSize;

    // Constructor
    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    // Method to calculate download time
    public void downloadTime(double speed) {
        double time = fileSize / speed;
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Download Time at " + speed + " MB/s: " + time + " seconds");
    }
}

// Main Class
public class LibrarySystem {
    public static void main(String[] args) {

        // PrintedBook objects
        PrintedBook pb1 = new PrintedBook("Java Programming", "James Smith", 2022, 250);
        PrintedBook pb2 = new PrintedBook("Data Structures", "Alan Brown", 2021, 300);

        // EBook objects
        EBook eb1 = new EBook("AI Basics", "Sarah Lee", 2023, 40);
        EBook eb2 = new EBook("Machine Learning", "John Doe", 2024, 60);

        // Display PrintedBooks
        pb1.displayInfo();
        pb1.readingTime();
        System.out.println();

        pb2.displayInfo();
        pb2.readingTime();
        System.out.println();

        // Display EBooks
        eb1.displayInfo();
        eb1.downloadTime(10); // speed = 10 MB/s
        System.out.println();

        eb2.displayInfo();
        eb2.downloadTime(20); // speed = 20 MB/s
    }
}
