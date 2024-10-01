package Try_Catch;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Try_Catch_f_3702 {
    public static void main(String args[]){
        System.out.println("Name: ATHITHRAJA. R\nReg.no: 2022503702\n");
        String filePath = "unknown.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
