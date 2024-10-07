// Tests object references and their behavior.
public class TestReference {
    int value;

    // Constructor to initialize the value
    TestReference(int value) {
        this.value = value;
    }

    // Method to modify the value
    void modifyValue(TestReference obj) {
        obj.value += 10;
    }

    public static void main(String[] args) {
        // Create an instance of TestReference
        TestReference ref = new TestReference(20);
        System.out.println("Before modification: " + ref.value);

        // Modify the value using the method
        ref.modifyValue(ref);
        System.out.println("After modification: " + ref.value);
    }
}