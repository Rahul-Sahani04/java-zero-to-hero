
// This program accepts a hostname and displays its IP address.
import java.net.InetAddress; // Import the InetAddress class for handling IP addresses
import java.net.UnknownHostException; // Import the UnknownHostException class for handling errors
import java.util.Scanner; // Import the Scanner class for user input

public class HostNameToIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading user input
        System.out.print("Enter hostname: "); // Prompt the user to enter a hostname
        String hostname = scanner.nextLine(); // Read the hostname entered by the user

        try {
            // Get the IP address of the host
            InetAddress address = InetAddress.getByName(hostname); // Resolve the hostname to an IP address
            System.out.println("IP address: " + address.getHostAddress()); // Print the IP address
        } catch (UnknownHostException e) {
            // Handle the case where the hostname could not be resolved
            System.out.println("Could not find IP address for: " + hostname); // Print an error message
        }
    }
}