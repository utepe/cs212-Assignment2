package app;

public class Book extends Item implements Comparable<Book>{
    public String author;
    String bookTitle;
    public int year;

    /**
     * Overloaded constructor Book
     * @param price
     * @param quantity
     * @param author
     * @param bookTitle
     * @param year
     * @throws InvalidTitleException
     * @throws InvalidPriceException
     * @throws InvalidQuantityException
     */
    public Book(double price, int quantity, String author, String bookTitle, int year)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        super("Book", price, quantity);
        this.author = author;
        this.bookTitle = bookTitle;
        this.year = year;
    }

    /**
     * @Override
     * Abstract method Display
     */
    public void Display() {
        System.out.println("Product: " + title + ", Item ID: " + itemID);
        System.out.println("Book Title: " + bookTitle + ", Author: " + author + ", Year: " + year);
        System.out.println("Price: " + price + ", Quantity: " + quantity);
        System.out.println("");
    }

    public int compareTo(Book o){
        return this.author.compareTo(o.author);
    }

}