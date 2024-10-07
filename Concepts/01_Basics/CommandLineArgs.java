// Demonstrates the use of command-line arguments.
public class CommandLineArgs {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg); // Print each command-line argument
            }
        } else {
            System.out.println("No command-line arguments found.");
        }
    }
}