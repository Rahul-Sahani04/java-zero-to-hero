// Demonstrates type casting in Java.
public class TypeCasting {
    public static void main(String[] args) {
        int intVal = 100;
        double doubleVal = intVal; // Implicit casting (int to double)

        System.out.println("Integer value: " + intVal);
        System.out.println("Double value (after implicit casting): " + doubleVal);

        double anotherDoubleVal = 9.78;
        int anotherIntVal = (int) anotherDoubleVal; // Explicit casting (double to int)

        System.out.println("Double value: " + anotherDoubleVal);
        System.out.println("Integer value (after explicit casting): " + anotherIntVal);
    }
}