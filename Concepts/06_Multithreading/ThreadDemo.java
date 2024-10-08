// Demonstrates creating threads using Thread class and Runnable interface.

// Custom thread class extending Thread
class MyThread extends Thread {
    // Override the run method to define the thread's task
    @Override
    public void run() {
        // Loop to print a message 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread is running");
        }
    }
}

// Custom runnable class implementing Runnable interface
class MyRunnable implements Runnable {
    // Override the run method to define the thread's task
    @Override
    public void run() {
        // Loop to print a message 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunnable is running");
        }
    }
}

// Main class to demonstrate thread creation
public class ThreadDemo {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread t1 = new MyThread();
        // Create a Thread instance with MyRunnable as its target
        Thread t2 = new Thread(new MyRunnable());

        // Start the threads
        t1.start(); // This will call the run method of MyThread
        t2.start(); // This will call the run method of MyRunnable
    }
}