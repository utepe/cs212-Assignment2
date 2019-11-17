package app;

public abstract class Item{
    protected int itemID = 1; //greater than 0 
    protected double price; //greater than 0
    protected int quantity; //greater than 0
    protected String title; //cannot be empty

   /**
    * Overloaded Item Constructor
    * @param title
    * @param price
    * @param quantity
    * @throws InvalidTitleException
    * @throws InvalidPriceException
    * @throws InvalidQuantityException
    */
    Item(String title, double price, int quantity) throws InvalidTitleException, InvalidPriceException, InvalidQuantityException{
        if(title.length() == 0) 
            throw new InvalidTitleException("No Title name");

        if(price < 0) 
            throw new InvalidPriceException("No Negative Price");

        if(quantity < 0)
            throw new InvalidQuantityException("No Negative Quantity");
        
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        itemID++;
    }

    //abstract method 
    public abstract void Display();

    public void Purchase(){
        quantity--;
    }

}