import java.io.*;
import java.net.*;

public class IntegerServer {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is running. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            // Receive integer from client
            int receivedNumber = in.readInt();
            System.out.println("Received from client: " + receivedNumber);

            // Send back a response (e.g., square of the number)
            int result = receivedNumber * receivedNumber;
            out.writeInt(result);
            System.out.println("Sent back: " + result);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
