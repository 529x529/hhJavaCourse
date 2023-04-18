package lesson4;

public class WrongPasswordException extends Exception{
    public WrongPasswordException (String description) {
        super(description);
    }

}
