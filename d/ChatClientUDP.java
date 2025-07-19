import java.net.*;
import java.io.*;

public class ChatClientUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("localhost");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        byte[] buffer = new byte[1000];

        System.out.println("Connected to UDP chat server.");

        while (true) {
            // Send message
            System.out.print("You: ");
            String message = userInput.readLine();
            byte[] sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 5001);
            socket.send(sendPacket);

            // Receive reply
            DatagramPacket replyPacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(replyPacket);
            String reply = new String(replyPacket.getData(), 0, replyPacket.getLength());
            System.out.println("Server: " + reply);
        }
    }
}
