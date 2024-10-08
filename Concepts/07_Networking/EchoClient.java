
// This program implements an echo client that sends messages to the server and receives the echoed messages.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // Server hostname
        int port = 12345; // Server port number

        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Connected to echo server");

            // Create input and output streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            String userInput;
            // Read user input and send it to the server
            while (true) {
                System.out.print("Enter message: ");
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                out.println(userInput);
                // Read and print the echoed message from the server
                System.out.println("Echoed from server: " + in.readLine());
            }
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }
}