
// Check if a number is prime.
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number from the user

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible by any number other than 1 and itself, it's not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}