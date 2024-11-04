import java.io.IOException;
import java.net.*;

public class CapitalizerUDPServer_3702 {
    private static final int PORT = 1234;

    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        System.out.println("Capitalizer UDP Server started...");
        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            byte[] buffer = new byte[256];
            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);
                String message = new String(request.getData(), 0, request.getLength()).toUpperCase();
                
                byte[] responseBytes = message.getBytes();
                DatagramPacket response = new DatagramPacket(responseBytes, responseBytes.length, 
                                                             request.getAddress(), request.getPort());
                socket.send(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
