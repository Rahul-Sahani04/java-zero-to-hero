// Custom exception class for handling low bank balance scenarios.
public class BankBalanceException extends Exception {
    public BankBalanceException(String message) {
        super(message); // Call the constructor of the superclass (Exception) with the error message.
    }
}