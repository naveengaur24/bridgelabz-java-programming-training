package OOPS.Class;

public class Book {
    String title;
    String author;
    int price;

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Great Gatsby";
        book1.author = "F. Scott Fitzgerald";
        book1.price = 10;
        System.out.println("Book Title: " + book1.title);
        System.out.println("Book Author: " + book1.author); 
        System.out.println("Book Price: $" + book1.price);
    }
}
