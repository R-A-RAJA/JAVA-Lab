package Lab.Ex4;
import java.util.Random;

public class MagicSquare3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R");
        System.out.println("Regno: 2022503702");
        int[][] magicSquare = new int[3][3];
        Random rand = new Random();

        // Read a random integer for the middle position
        int middleValue = rand.nextInt(100) + 1; // Random integer between 1 and 100 for the middle
        magicSquare[1][1] = middleValue; // Set the middle value in the 3x3 magic square

        System.out.println("Middle Value: " + middleValue);

        // Fill the other positions to form a magic square
        fillMagicSquare(magicSquare, middleValue);

        // Print the resulting magic square
        printMagicSquare(magicSquare);
    }

    // Function to fill the magic square based on the middle value
    public static void fillMagicSquare(int[][] magicSquare, int middleValue) {
        // The standard 3x3 magic square configuration
        int[][] baseMagicSquare = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        // Find the adjustment needed to match the middle value
        int adjustment = middleValue - baseMagicSquare[1][1];

        // Adjust all elements to make the middle value correct
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                magicSquare[i][j] = baseMagicSquare[i][j] + adjustment;
            }
        }
    }

    // Function to print the magic square
    public static void printMagicSquare(int[][] magicSquare) {

        System.out.println("3x3 Magic Square:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
