package Lab.Ex3;

import java.util.Scanner;

class Operation {
    // Method to add two matrices
    void sum(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of Matrix: ");
        printMatrix(c);
    }

    // Method to calculate and sort columns based on their sums
    void sortColumnsBySum(int[][] c) {
        int n = c.length;
        int[] colSums = new int[n];

        // Calculate the sum of each column
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                colSums[j] += c[i][j];
            }
        }

        // Sort columns based on their sums
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (colSums[j] > colSums[j + 1]) {
                    // Swap columns in the matrix
                    for (int k = 0; k < n; k++) {
                        int temp = c[k][j];
                        c[k][j] = c[k][j + 1];
                        c[k][j + 1] = temp;
                    }
                    // Swap the column sums
                    int tempSum = colSums[j];
                    colSums[j] = colSums[j + 1];
                    colSums[j + 1] = tempSum;
                }
            }
        }

        System.out.println("Matrix after sorting columns by their sums:");
        printMatrix(c);
    }

    // Method to print a matrix
    void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "  ");
            }
            System.out.println();
        }
    }
}

public class Sum_2d_3702 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name: ATHITHRAJA. R");
        System.out.println("Regno: 2022503702");
        System.out.print("Enter the size of array: ");
        int s = in.nextInt();
        int[][] a = new int[s][s];
        int[][] b = new int[s][s];
        int[][] c = new int[s][s];

        System.out.println("2D array A:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Enter the element (" + (i + 1) + " " + (j + 1) + "): ");
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("2D array B:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Enter the element (" + (i + 1) + " " + (j + 1) + "): ");
                b[i][j] = in.nextInt();
            }
        }

        Operation operation = new Operation();
        operation.sum(a, b, c);
        operation.sortColumnsBySum(c);
    }
}
