
// Implements binary search algorithm.
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize a sorted array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Read the target value from the user
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        // Perform binary search
        int result = Arrays.binarySearch(numbers, target);

        if (result >= 0) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}