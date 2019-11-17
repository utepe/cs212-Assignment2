package app;

/** Custom Exception */

public class InvalidTitleException extends Exception{

    public InvalidTitleException(String name) {
        super(name);
    }
}