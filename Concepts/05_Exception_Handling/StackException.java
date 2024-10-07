// Custom exception class for handling stack overflow and underflow scenarios.
public class StackException extends Exception {
    public StackException(String message) {
        super(message); // Call the constructor of the superclass (Exception) with the error message.
    }
}