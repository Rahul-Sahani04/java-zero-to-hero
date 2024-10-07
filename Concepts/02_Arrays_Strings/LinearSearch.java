
// Implements linear search algorithm.
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Read the target value from the user
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println("Number found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}