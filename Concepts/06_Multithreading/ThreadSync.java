// Demonstrates thread synchronization using synchronized methods.
class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    // Method to get the current count value
    public int getCount() {
        return count;
    }
}

// Thread class that increments the counter
class CounterThread extends Thread {
    private Counter counter;

    // Constructor to initialize the counter
    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    // The run method contains the code that will be executed by the thread
    @Override
    public void run() {
        // Increment the counter 1000 times
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// Main class to demonstrate thread synchronization
public class ThreadSync {
    public static void main(String[] args) {
        // Create a single Counter object
        Counter counter = new Counter();

        // Create two threads that share the same Counter object
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count value
        System.out.println("Final count: " + counter.getCount());
    }
}