// Custom exception class for demonstrating user-defined exceptions.
public class UserDefinedException extends Exception {
    public UserDefinedException(String message) {
        super(message); // Call the constructor of the superclass (Exception) with the error message.
    }
}