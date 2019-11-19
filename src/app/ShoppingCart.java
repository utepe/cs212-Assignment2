package app;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart{

    protected static List<Item> addItem(List<Item> items)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Which item would you like to add to Cart?");
        System.out.println("1. Add Book");
        System.out.println("2. Add Gift Card");
        System.out.println("3. Add Shoe");
        int choice = sc.nextInt();
        
        System.out.println("");

        switch (choice) {
            case 1:
                items.add(addBook());
                break;
            case 2:
                items.add(addGiftCard());
                break;
            case 3:
                items.add(addShoe());
        }
        return items;
    }

    protected static Item addBook() 
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Price of Book: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity of this book: ");
        int quantity = sc.nextInt();
        System.out.println("Enter Author name: ");
        String author = scan.nextLine();
        System.out.println("Enter Title of the Book: ");
        String bookTitle = scan.nextLine();
        System.out.println("Enter year it was written: ");
        int year = sc.nextInt();
        
        System.out.println("");

        Item book = new Book(price, quantity, author, bookTitle, year);
        return book;
    }

    protected static Item addGiftCard() 
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {

        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Price of Gift Card: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity of this Gift Card: ");
        int quantity = sc.nextInt();
        System.out.println("Enter the Gift Card Label: ");
        String label = scan.nextLine();
        System.out.println("Enter the Gift Card Manufacturer: ");
        String manufacturer = scan.nextLine();
        
        System.out.println("");

        Item giftCard = new GiftCard(price, quantity, label, manufacturer);
		return giftCard;
    }
    
    protected static Item addShoe() 
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {

        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Price of Shoe: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity of Shoe: ");
        int quantity = sc.nextInt();
        System.out.println("Enter Colour of Shoe: ");
        String colour = scan.nextLine();
        System.out.println("Enter Size of Shoe: ");
        double size = sc.nextDouble();

        System.out.println("");

        Item shoe = new Shoe(price, quantity, colour, size);
        return shoe;
    }

    protected static void displayAllItems(List<Item> items) {
        for (Item item : items) {
            item.Display();
        }
    }

    protected static void displayBooks(List<Item> items){
        LinkedList<Book> bookList = new LinkedList<>();
        items.forEach(book -> {
            if(book instanceof Book)
                bookList.add((Book) book);
        });
    
        Collections.sort(bookList);
        bookList.forEach(book-> {
            book.Display();
        });
    }

    protected static void displayGiftCards(List<Item> items){
        LinkedList<GiftCard> cardList = new LinkedList<>();
        items.forEach(giftCard -> {
            if(giftCard instanceof  GiftCard)
                cardList.add((GiftCard) giftCard);
        });

        Collections.sort(cardList);
        cardList.forEach(giftCard ->{
            giftCard.Display();
        });
    }

    protected static void displayShoes(List<Item> items){
        LinkedList<Shoe> shoeList = new LinkedList<>();
        items.forEach(shoe ->{
            if(shoe instanceof Shoe)
                shoeList.add((Shoe) shoe);
        });

        Collections.sort(shoeList);
        shoeList.forEach(shoe ->{
            shoe.Display();
        });
    }

    
    protected static void purchaseItem(List<Item> items, int itemID) {
        items.forEach(item -> {
            if(item.itemID == itemID){
                item.Purchase();
            }
        });
    }

}