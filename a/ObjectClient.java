import java.io.*;
import java.net.*;

public class ObjectClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(host, port)) {
            ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());

            // Create and send Person object
            Person p = new Person("Alice", 25);
            objOut.writeObject(p);
            System.out.println("Sent object: " + p);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
