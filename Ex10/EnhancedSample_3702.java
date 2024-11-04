import java.io.*;

public class EnhancedSample_3702 {
    public static void main(String[] args) {
        System.out.print("Name: Athithraja. R\nReg.no: 2022503702\n");

        try {
            BufferedReader sourceReader = new BufferedReader(new FileReader("source.txt"));
            BufferedWriter destinationWriter = new BufferedWriter(new FileWriter("destinationBuffered.txt"));

            String line;
            long startTime = System.currentTimeMillis();
            System.out.println("Buffered Character Stream: ");
            System.out.print("source.txt: ");

            while ((line = sourceReader.readLine()) != null) {
                System.out.println(line);
                destinationWriter.write(line);
                destinationWriter.newLine();
            }
            sourceReader.close();
            destinationWriter.close();

            long endTime = System.currentTimeMillis();
            long durationBufferedCharStream = endTime - startTime;
            System.out.println("Buffered Character Stream Duration: " + durationBufferedCharStream + " ms");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("source.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("destinationBufferedBytes.txt"));

            int byteData;
            startTime = System.currentTimeMillis();
            System.out.println("Buffered Byte Stream: ");
            System.out.print("source.txt: ");
            while ((byteData = bufferedInputStream.read()) != -1) {
                System.out.print((char) byteData);
                bufferedOutputStream.write(byteData);
            }

            bufferedInputStream.close();
            bufferedOutputStream.close();

            endTime = System.currentTimeMillis();
            long durationBufferedByteStream = endTime - startTime;
            System.out.println("\nBuffered Byte Stream Duration: " + durationBufferedByteStream + " ms");

            String targetWord = "example";
            int wordCount = countWordOccurrences("source.txt", targetWord);
            System.out.println("Occurrences of the word '" + targetWord + "': " + wordCount);

            encryptFileBuffered("source.txt", "encryptedBuffered.txt", 3);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static int countWordOccurrences(String filePath, String targetWord) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
        String line;
        int count = 0;
        while ((line = fileReader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equals(targetWord)) {
                    count++;
                }
            }
        }
        fileReader.close();
        return count;
    }

    public static void encryptFileBuffered(String sourcePath, String destinationPath, int shift) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(sourcePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationPath));
        int charData;
        while ((charData = bufferedReader.read()) != -1) {
            char encryptedChar = (char) (charData + shift);
            bufferedWriter.write(encryptedChar);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
