import java.io.*;
import java.net.*;

public class TCPClient_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        System.out.print("Choose server type (1 - Capitalizer, 2 - Email Validator): ");
        try (BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {
            int choice = Integer.parseInt(userInput.readLine());
            int port = (choice == 1) ? 1234 : 5678;
            try (Socket socket = new Socket("localhost", port)) {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line;
                while (true) {
                    System.out.print("Enter input (or 'exit' to quit): ");
                    line = userInput.readLine();
                    if ("exit".equalsIgnoreCase(line)) break;
                    out.println(line);
                    System.out.println("Server Response: " + in.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
