import java.io.*;

public class Copy_3702 {
    public static void main(String[] args) {
        System.out.print("Name: Athithraja. R\nReg.no: 2022503702");
        try {
            // Character stream
            FileReader source1 = new FileReader("source.txt");
            FileWriter destination1 = new FileWriter("destination1.txt");
            int i;
            long startTime = System.nanoTime();

            System.out.println("Character Stream: ");
            System.out.print("source.txt: ");

            while ((i = source1.read()) != -1) {
                System.out.print((char) i);
                destination1.write(i);
            }
            System.out.println();
            source1.close();
            destination1.close();

            long endTime = System.nanoTime();
            long durationCharStream = (endTime - startTime);
            System.out.println("Character Stream Duration: " + durationCharStream + " ns");

            FileReader b1 = new FileReader("destination1.txt");
            int i1 = 0;

            System.out.print("Copied txt: ");
            while ((i1 = b1.read()) != -1) {
                System.out.print((char) i1);
            }
            b1.close();

            //------------------------------------------------------------------------------------------------------
            // Byte Stream
            FileInputStream source2 = new FileInputStream("source.txt");
            FileOutputStream destination2 = new FileOutputStream("destination2.txt");

            int i3;
            startTime = System.nanoTime();
            System.out.println("Byte Stream: ");
            System.out.print("source.txt: ");

            while ((i3 = source2.read()) != -1) {
                System.out.print((char) i3);
                destination2.write(i3);
            }

            System.out.println();
            source2.close();
            destination2.close();

            endTime = System.nanoTime();
            long durationByteStream = (endTime - startTime);
            System.out.println("Byte Stream Duration: " + durationByteStream + " ns");

            FileInputStream b2 = new FileInputStream("destination2.txt");
            int i4;

            System.out.print("Copied txt: ");
            while ((i4 = b2.read()) != -1) {
                System.out.print((char) i4);
            }
            b2.close();

            // Count occurrences of a specific character
            char targetChar = 'a'; // Example character to count
            int charCount = countCharacterOccurrences("source.txt", targetChar);
            System.out.println("\nOccurrences of '" + targetChar + "': " + charCount);

            // Encrypt the text
            encryptFile("source.txt", "encrypted.txt", 3); // Example shift of 3

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static int countCharacterOccurrences(String filePath, char targetChar) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        int count = 0;
        int i;
        while ((i = fileReader.read()) != -1) {
            if ((char) i == targetChar) {
                count++;
            }
        }
        fileReader.close();
        return count;
    }

    public static void encryptFile(String sourcePath, String destinationPath, int shift) throws IOException {
        FileReader fileReader = new FileReader(sourcePath);
        FileWriter fileWriter = new FileWriter(destinationPath);
        int i;
        while ((i = fileReader.read()) != -1) {
            char encryptedChar = (char) (i + shift);
            fileWriter.write(encryptedChar);
        }
        fileReader.close();
        fileWriter.close();
    }
}
