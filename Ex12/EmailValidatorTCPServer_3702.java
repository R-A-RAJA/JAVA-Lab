import java.io.*;
import java.net.*;
import java.util.regex.*;

public class EmailValidatorTCPServer_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        System.out.println("Email Validator TCP Server started...");
        try (ServerSocket serverSocket = new ServerSocket(5678)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                String email;
                while ((email = in.readLine()) != null) {
                    boolean isValid = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w+$").matcher(email).matches();
                    out.println(isValid ? "Valid Email" : "Invalid Email");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
