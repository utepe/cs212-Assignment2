package app;

public class Book extends Item implements Comparable<Book>{
    public String author;
    String bookTitle;
    public int year;

    public Book(double price, int quantity, String author, String bookTitle, int year)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        super("Book", price, quantity);
        this.author = author;
        this.bookTitle = bookTitle;
        this.year = year;
    }


    public void Display() {
        System.out.println("Product: " + title + ", Item ID: " + itemID);
        System.out.println("Book Title: " + bookTitle + ", Author: " + author + ", Year: " + year);
        System.out.println("Price: " + price + ", Quantity; " + quantity);
        System.out.println("");
    }

    public int compareTo(Book compareBook){
        return this.author.compareTo(compareBook.author);
    }

}