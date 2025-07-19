import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(host, port)) {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            Scanner scanner = new Scanner(System.in);

            // Get user input
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter operation (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            // Send data to server
            out.writeInt(num1);
            out.writeInt(num2);
            out.writeChar(operator);

            // Receive and display result
            String result = in.readUTF();
            System.out.println("Server says: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
