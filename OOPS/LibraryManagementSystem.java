import java.util.ArrayList;
import java.util.Scanner;

// Book class to represent individual books
class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        } else {
            return false;
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
    }

    public String getISBN() {
        return ISBN;
    }
}

// Library class to manage a collection of books
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to find a book by ISBN
    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

// Main class to interact with the library
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.addBook(new Book("1984", "George Orwell", "1122334455"));

        // User interaction loop
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowISBN = scanner.next();
                    Book borrowBook = library.findBookByISBN(borrowISBN);
                    if (borrowBook != null) {
                        if (borrowBook.borrowBook()) {
                            System.out.println("Book borrowed successfully!");
                        } else {
                            System.out.println("Book is currently unavailable.");
                        }
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.next();
                    Book returnBook = library.findBookByISBN(returnISBN);
                    if (returnBook != null) {
                        returnBook.returnBook();
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
