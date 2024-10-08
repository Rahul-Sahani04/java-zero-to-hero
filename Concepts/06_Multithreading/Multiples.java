// Demonstrates printing multiples of 2, 3, and 4 simultaneously using threads.

// Class that implements Runnable to print multiples of a given number
class MultiplePrinter implements Runnable {
    private int number; // The number whose multiples will be printed

    // Constructor to initialize the number
    public MultiplePrinter(int number) {
        this.number = number;
    }

    // The run method contains the code that will be executed by the thread
    @Override
    public void run() {
        // Loop to print the first 5 multiples of the number
        for (int i = 1; i <= 5; i++) {
            System.out.println("Multiple of " + number + ": " + (number * i));
            try {
                // Sleep for 500 milliseconds to simulate delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Print stack trace if an InterruptedException occurs
                e.printStackTrace();
            }
        }
    }
}

// Main class to start the threads
public class Multiples {
    public static void main(String[] args) {
        // Create threads for printing multiples of 2, 3, and 4
        Thread t1 = new Thread(new MultiplePrinter(2));
        Thread t2 = new Thread(new MultiplePrinter(3));
        Thread t3 = new Thread(new MultiplePrinter(4));

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}