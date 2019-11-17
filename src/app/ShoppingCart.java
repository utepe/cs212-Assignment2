package app;

import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingCart{

    protected static LinkedList<Item> addItem(LinkedList<Item> items)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Which item would you like to add to Cart?");
        System.out.println("1. Add Book");
        System.out.println("2. Add Gift Card");
        System.out.println("3. Add Shoe");
        int choice = sc.nextInt();
        sc.close();
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

        System.out.println("Enter Price of Book: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity of this book: ");
        int quantity = sc.nextInt();
        System.out.println("Enter Author name: ");
        String author = sc.nextLine();
        System.out.println("Enter Title of the Book: ");
        String bookTitle = sc.nextLine();
        System.out.println("Enter year it was written: ");
        int year = sc.nextInt();
        
        sc.close();
        System.out.println("");

        Item book = new Book(price, quantity, author, bookTitle, year);
        return book;
    }

    protected static Item addGiftCard() 
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Price of Gift Card: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity of this Gift Card: ");
        int quantity = sc.nextInt();
        System.out.println("Enter the Gift Card Label: ");
        String label = sc.nextLine();
        System.out.println("Enter the Gift Card Manufacturer: ");
        String manufacturer = sc.nextLine();
        
        sc.close();
        System.out.println("");

        Item giftCard = new GiftCard(price, quantity, label, manufacturer);
		return giftCard;
    }
    
    protected static Item addShoe() 
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Price of Shoe: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity of Shoe: ");
        int quantity = sc.nextInt();
        System.out.println("Enter Colour of Shoe: ");
        String colour = sc.nextLine();
        System.out.println("Enter Size of Shoe: ");
        double size = sc.nextDouble();

        sc.close();
        System.out.println("");

        Item shoe = new Shoe(price, quantity, colour, size);
        return shoe;
    }

    protected static void displayAllItems(LinkedList<Item> items) {
        items.forEach(name -> {
            name.Display();
        });
    }

    protected static void displayBooks(LinkedList<Item> items){
        items.forEach(name -> {
            if(name instanceof Book)
                items.sort(null);
                ((Book) name).Display();
        });
    }

    protected static void displayGiftCards(LinkedList<Item> items){
        items.forEach(name -> {
            if(name instanceof  GiftCard)
                items.sort(null);
                ((GiftCard) name).Display();
        });
    }

    protected static void displayShoes(LinkedList<Item> items){
        items.forEach(name -> {
            if(name instanceof Shoe)
                items.sort(null);
                ((Shoe) name).Display();
        });
    }

    
    protected static void purchaseItem(LinkedList<Item> items, int itemID) {
        items.forEach(name -> {
            if(name.itemID == itemID){
                name.Purchase();
            }
        });
    }

}