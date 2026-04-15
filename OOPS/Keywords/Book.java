package OOPS.Keywords;

class Book {
    static String libraryName = "Central Library";

    String title;
    String author;
    final String isbn;

    // Constructor using this
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James Gosling", "101");
        Book b2 = new Book("DSA", "Mark Allen", "102");

        if (b1 instanceof Book) {
            b1.display();
        }

        if (b2 instanceof Book) {
            b2.display();
        }

        Book.displayLibraryName();
    }
}