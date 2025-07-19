import java.io.*;
import java.net.*;

public class ChatServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("TCP Chat Server started...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String msgFromClient = in.readLine();
            System.out.println("Client: " + msgFromClient);

            System.out.print("You: ");
            String reply = userInput.readLine();
            out.println(reply);
        }
    }
}
