import java.io.*;
import java.net.*;

public class CalcServer {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Calculator Server started...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                // Receive data
                int num1 = in.readInt();
                int num2 = in.readInt();
                char operator = in.readChar();

                double result;
                boolean valid = true;

                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            valid = false;
                            result = 0;
                        } else {
                            result = (double) num1 / num2;
                        }
                        break;
                    case '%':
                        if (num2 == 0) {
                            valid = false;
                            result = 0;
                        } else {
                            result = num1 % num2;
                        }
                        break;
                    default:
                        valid = false;
                        result = 0;
                        break;
                }

                // Send result or error
                if (valid) {
                    out.writeUTF("Result: " + result);
                } else {
                    out.writeUTF("Error: Invalid operation (e.g., division by zero or wrong operator)");
                }

                socket.close();
                System.out.println("Client served.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
