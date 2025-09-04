public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // 1. Default constructor → empty book
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "N/A";
        this.isAvailable = true; // by default available
    }

    // 2. Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = "N/A";
        this.isAvailable = true;
    }

    // 3. Constructor with all details
    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    // Method to borrow book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    // Method to return book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Method to display book info
    public void displayBookInfo() {
        System.out.println("\n=== BOOK INFO ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("📚 LIBRARY BOOK MANAGEMENT 📚");

        // Book 1: Default constructor
        Book b1 = new Book();

        // Book 2: Constructor with title & author
        Book b2 = new Book("1984", "George Orwell");

        // Book 3: Full constructor
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0547928227", true);

        // Borrow & return actions
        b2.borrowBook();
        b2.borrowBook();  // try borrowing again
        b2.returnBook();

        b3.borrowBook();

        // Display books
        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();
    }
}
