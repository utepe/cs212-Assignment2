package app;

public class Shoe extends Item implements Comparable<Shoe>{
    private String colour;
    public double size;

    public Shoe(double price, int quantity, String colour, double size)
            throws InvalidTitleException, InvalidPriceException, InvalidQuantityException {
        super("Shoe", price, quantity);
        if(isValidColour(colour))
            this.colour = colour;
        this.size = size;
    }

    private boolean isValidColour(String colour){
        if (colour.equalsIgnoreCase("white") ||
            colour.equalsIgnoreCase("silver") ||
            colour.equalsIgnoreCase("red") ||
            colour.equalsIgnoreCase("beige") ||
            colour.equalsIgnoreCase("brown") ||
            colour.equalsIgnoreCase("blue") ||
            colour.equalsIgnoreCase("black") ||
            colour.equalsIgnoreCase("pink"))
                return true;
        else
            return false;
    }

    public void Display(){
        System.out.println("Product: " + title + ", Item ID: " + itemID);
        System.out.println("Colour: " + colour + ", Size: " + size);
        System.out.println("Price: " + price + ", Quantity: " + quantity);
        System.out.println("");
    }

    public int compareTo(Shoe compareShoe){
        return Double.compare(this.size, compareShoe.size);
    }
}