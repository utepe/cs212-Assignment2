package app;

public class GiftCard extends Item implements Comparable<GiftCard>{
    public String label;
    public String manufacturer;

    public GiftCard(double price, int quantity, String label, String manufacturer)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        super("Gift Card", price, quantity);
        
        this.label = label;
        this.manufacturer = manufacturer;
    }

    public void Display(){
        System.out.println("Product: " + title + ", Item ID: " + itemID);
        System.out.println("Label: " + label + ", Manufacturer: " + manufacturer);
        System.out.println("Price: " + price + ", Quantity: " + quantity);
        System.out.println("");
    }

    public int compareTo(GiftCard compareGiftCard){
        return this.label.compareTo(compareGiftCard.label);
    }


}