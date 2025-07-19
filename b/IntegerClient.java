import java.io.*;
import java.net.*;

public class IntegerClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(host, port)) {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            // Send an integer
            int numberToSend = 7;
            out.writeInt(numberToSend);
            System.out.println("Sent to server: " + numberToSend);

            // Receive response
            int result = in.readInt();
            System.out.println("Received from server: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
