
// Perform basic arithmetic operations.
import java.util.Scanner;

public class SimpleOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble(); // Read the first number
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble(); // Read the second number

        double sum = num1 + num2; // Calculate the sum
        double difference = num1 - num2; // Calculate the difference
        double product = num1 * num2; // Calculate the product
        double quotient = num1 / num2; // Calculate the quotient

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}