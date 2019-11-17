package app;

/** Custom Exception */

public class InvalidPriceException extends Exception{

    public InvalidPriceException(String name) {
        super(name);
    }
}