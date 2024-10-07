
// Demonstrates sorting algorithms.
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 5, 3, 8, 1, 2 };

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Integer[] numbersDesc = { 5, 3, 8, 1, 2 };
        Arrays.sort(numbersDesc, (a, b) -> b - a);
        System.out.println("Array sorted in descending order: " + Arrays.toString(numbersDesc));
    }
}