import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientServer {

    // Inner class for the TCP Server
    static class TCPServer implements Runnable {
        private int port;

        public TCPServer(int port) {
            this.port = port;
        }

        @Override
        public void run() {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                System.out.println("Server started on port " + port);

                while (true) {
                    // Accept a client connection
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected: " + clientSocket.getInetAddress());

                    // Create input stream to read client messages
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    String inputLine;
                    // Read and print client messages
                    while ((inputLine = in.readLine()) != null) {
                        System.out.println("Received: " + inputLine);
                    }

                    // Close the client connection
                    clientSocket.close();
                }
            } catch (IOException e) {
                System.err.println("Error starting server: " + e.getMessage());
            }
        }
    }

    // Inner class for the TCP Client
    static class TCPClient implements Runnable {
        private String hostname;
        private int port;

        public TCPClient(String hostname, int port) {
            this.hostname = hostname;
            this.port = port;
        }

        @Override
        public void run() {
            try (Socket socket = new Socket(hostname, port)) {
                System.out.println("Connected to server");

                // Create output stream to send messages to the server
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
                }
            } catch (IOException e) {
                System.err.println("Error connecting to server: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        int port = 12345; // Port number to listen on
        String hostname = "localhost"; // Server hostname

        // Start the server in a new thread
        new Thread(new TCPServer(port)).start();

        // Start the client in a new thread
        new Thread(new TCPClient(hostname, port)).start();
    }
}