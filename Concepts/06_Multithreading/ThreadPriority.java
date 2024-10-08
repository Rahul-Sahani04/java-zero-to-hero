// Demonstrates setting thread priorities.
class PriorityThread extends Thread {
    // Constructor to set the name of the thread
    public PriorityThread(String name) {
        super(name);
    }

    // The run method contains the code that will be executed when the thread is started
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print the name of the thread and its priority
            System.out.println(getName() + " is running with priority " + getPriority());
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        // Create three threads with different names
        PriorityThread t1 = new PriorityThread("Thread 1");
        PriorityThread t2 = new PriorityThread("Thread 2");
        PriorityThread t3 = new PriorityThread("Thread 3");

        // Set different priorities for each thread
        t1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority (1)
        t2.setPriority(Thread.NORM_PRIORITY); // Set normal priority (5)
        t3.setPriority(Thread.MAX_PRIORITY); // Set maximum priority (10)

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}