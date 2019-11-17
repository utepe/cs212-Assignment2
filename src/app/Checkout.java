package app;

import java.util.LinkedList;
import java.util.Scanner;

/** Tester Class */

public class Checkout extends ShoppingCart{
    public static void main(String[] args)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        LinkedList<Item> items = new LinkedList<Item>();
        Scanner sc = new Scanner(System.in);
        

        while(true){
            System.out.println("Welcome to the e-Store, please select what you would like to do: ");
            System.out.println("1. Add item to the inventory");
            System.out.println("2. Display all items");
            System.out.println("3. Display only Books");
            System.out.println("4. Display only Gift Cards");
            System.out.println("5. Display only Shoes");
            System.out.println("6. Purchase an item");
            

            int choice = sc.nextInt();
            sc.close();
            System.out.println("");

            switch (choice) {
                case 1:
                    items = addItem(items);
                    break;
                case 2:
                    displayAllItems(items);
                    break;
                case 3:
                    displayBooks(items);
                    break;
                case 4:
                    displayGiftCards(items);
                    break;
                case 5:
                    displayShoes(items);
                    break;
                case 6:
                    System.out.println("Please enter the ItemID of the product you would like to purchase: ");
                    int itemID = sc.nextInt();
                    purchaseItem(items, itemID);
                    break;
                default:
                    break;
            }
        }
    }

}