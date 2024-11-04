import java.net.*;
import java.io.*;

public class UDPClient_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        System.out.print("Choose server type (1 - Capitalizer, 2 - Email Validator): ");
        try (BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {
            int choice = Integer.parseInt(userInput.readLine());
            int port = (choice == 1) ? 1234 : 5678;
            InetAddress address = InetAddress.getByName("localhost");
            
            try (DatagramSocket socket = new DatagramSocket()) {
                while (true) {
                    System.out.print("Enter input (or 'exit' to quit): ");
                    String input = userInput.readLine();
                    if ("exit".equalsIgnoreCase(input)) break;

                    byte[] sendData = input.getBytes();
                    DatagramPacket request = new DatagramPacket(sendData, sendData.length, address, port);
                    socket.send(request);

                    byte[] receiveBuffer = new byte[256];
                    DatagramPacket response = new DatagramPacket(receiveBuffer, receiveBuffer.length);
                    socket.receive(response);

                    String responseMessage = new String(response.getData(), 0, response.getLength());
                    System.out.println("Server Response: " + responseMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
