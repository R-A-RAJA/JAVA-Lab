import java.net.*;
import java.util.regex.*;

public class EmailValidatorUDPServer_3702 {
    private static final int PORT = 5678;

    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        System.out.println("Email Validator UDP Server started...");
        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            byte[] buffer = new byte[256];
            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);
                String email = new String(request.getData(), 0, request.getLength());
                
                boolean isValid = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w+$").matcher(email).matches();
                String responseMessage = isValid ? "Valid Email" : "Invalid Email";
                
                byte[] responseBytes = responseMessage.getBytes();
                DatagramPacket response = new DatagramPacket(responseBytes, responseBytes.length, 
                                                             request.getAddress(), request.getPort());
                socket.send(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
