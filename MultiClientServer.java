import java.io.*;
import java.net.*;

public class MultiClientServer {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accept one client at a time
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(
                        clientSocket.getOutputStream(), true);

                String message = in.readLine(); // Read message from client
                System.out.println("Received: " + message);

                // Respond to client
                String response = "Hello, client! Your message was: " + message;
                out.println(response);

                clientSocket.close(); // Disconnect this client
                System.out.println("Client disconnected.\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
