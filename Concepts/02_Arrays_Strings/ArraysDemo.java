// Demonstrates basic array operations.
public class ArraysDemo {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Print the elements of the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // Find the largest element in the array
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}