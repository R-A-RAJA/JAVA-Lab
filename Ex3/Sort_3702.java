package Lab.Ex3;

import java.util.Random;
import java.util.Scanner;

class Sorter {
    private int[] intArray;
    private char[] charArray;
    private int comparisons;

    public Sorter(int n) {
        intArray = new int[n];
        charArray = new char[n];
        generateArrays(n);
    }

    private void generateArrays(int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            intArray[i] = random.nextInt(100); // Random integer between 0 and 99
            charArray[i] = (char) (random.nextBoolean() ? 65 + random.nextInt(26) : 97 + random.nextInt(26)); // 'A'-'Z' or 'a'-'z'
        }
    }

    public void sortArrays() {
        comparisons = bubbleSort(intArray);
        bubbleSortCharArray(charArray);
    }

    private int bubbleSort(int[] array) {
        int comparisons = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return comparisons;
    }

    private void bubbleSortCharArray(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printResults() {
        printHorizontalLine(intArray.length);
        printIndices(intArray.length);
        printHorizontalLine(intArray.length);
        printArray(intArray);
        printHorizontalLine(intArray.length);
        printArray(charArray);
        printHorizontalLine(intArray.length);
        System.out.println("Number of comparisons done: " + comparisons);
    }

    private void printIndices(int n) {
        System.out.print("| ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d | ", i);
        }
        System.out.println();
    }

    private void printArray(int[] array) {
        System.out.print("| ");
        for (int i : array) {
            System.out.printf("%d | ", i);
        }
        System.out.println();
    }

    private void printArray(char[] array) {
        System.out.print("| ");
        for (char c : array) {
            System.out.printf("%c | ", c);
        }
        System.out.println();
    }

    private void printHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("----");
        }
        System.out.println("-");
    }
}

public class Sort_3702 {
    public static void main(String[] args) {
        System.out.println("Name: ATHITHRAJA. R\nRegno: 2022503702");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Sorter sorter = new Sorter(n);
        sorter.sortArrays();
        sorter.printResults();
    }
}
