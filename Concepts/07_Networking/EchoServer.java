
// This program implements an echo server that listens for client messages and echoes them back.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        int port = 12345; // Port number to listen on

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Echo server started on port " + port);

            while (true) {
                // Accept a client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Create input and output streams for communication
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String inputLine;
                // Read client messages and echo them back
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Received: " + inputLine);
                    out.println(inputLine);
                }

                // Close the client connection
                clientSocket.close();
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
}