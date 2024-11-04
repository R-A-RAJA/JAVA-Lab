import java.io.*;
import java.net.*;

public class CapitalizerTCPServer_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        System.out.println("Capitalizer TCP Server started...");
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    out.println(inputLine.toUpperCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
