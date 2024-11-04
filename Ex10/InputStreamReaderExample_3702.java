import java.io.*;

public class InputStreamReaderExample_3702 {
    public static void main(String[] args) {
        System.out.print("Name: Athithraja. R\nReg.no: 2022503702\n");

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("source.txt"));
            int charCount = countCharacterOccurrences(inputStreamReader, 'a');
            System.out.println("Occurrences of 'a': " + charCount);
            inputStreamReader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static int countCharacterOccurrences(InputStreamReader inputStreamReader, char targetChar) throws IOException {
        int count = 0;
        int data;
        while ((data = inputStreamReader.read()) != -1) {
            if ((char) data == targetChar) {
                count++;
            }
        }
        return count;
    }
}
