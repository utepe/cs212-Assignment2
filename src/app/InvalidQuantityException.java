package app;

/** Custom Exception */

public class InvalidQuantityException extends Exception{

    public InvalidQuantityException(String name) {
        super(name);
    }
}