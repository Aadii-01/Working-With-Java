import java.io.*;
import java.net.*;

public class ObjectServer {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream());

            // Receive object
            Person person = (Person) objIn.readObject();
            System.out.println("Received object: " + person);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
