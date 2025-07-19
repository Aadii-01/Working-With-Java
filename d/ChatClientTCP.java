import java.io.*;
import java.net.*;

public class ChatClientTCP {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected to TCP chat server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("You: ");
            String message = userInput.readLine();
            out.println(message);

            String reply = in.readLine();
            System.out.println("Server: " + reply);
        }
    }
}
