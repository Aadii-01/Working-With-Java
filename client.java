import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverHost = "localhost";
        int serverPort = 9876;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            byte[] sendBuffer;
            byte[] receiveBuffer = new byte[1024];

            // Send message to server
            String message = "Hello from Client!";
            sendBuffer = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName(serverHost);

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
            System.out.println("Message sent to server.");

            // Receive response from server
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
