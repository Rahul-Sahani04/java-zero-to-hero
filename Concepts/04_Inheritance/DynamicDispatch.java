// Demonstrates dynamic method dispatch (runtime polymorphism).
class A {
    // Method to be overridden
    void display() {
        System.out.println("Inside A's display method");
    }
}

class B extends A {
    // Override the display method
    void display() {
        System.out.println("Inside B's display method");
    }
}

class C extends A {
    // Override the display method
    void display() {
        System.out.println("Inside C's display method");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        A a; // Declare a reference of type A

        // Create instances of B and C
        B b = new B();
        C c = new C();

        // Point the reference to an instance of B
        a = b;
        a.display(); // Calls B's display method

        // Point the reference to an instance of C
        a = c;
        a.display(); // Calls C's display method
    }
}