import java.net.*;
import java.io.*;

public class ChatServerUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(5001);
        byte[] buffer = new byte[1000];
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("UDP Chat Server started...");

        while (true) {
            // Receive message
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Client: " + message);

            // Get and send reply
            System.out.print("You: ");
            String reply = userInput.readLine();
            byte[] sendData = reply.getBytes();
            DatagramPacket replyPacket = new DatagramPacket(sendData, sendData.length, packet.getAddress(), packet.getPort());
            socket.send(replyPacket);
        }
    }
}
