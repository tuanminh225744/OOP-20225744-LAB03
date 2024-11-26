package hust.soict.dsai.lab01;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter the matrices (yes/no)? ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int rows, cols;
        int[][] matrixA, matrixB, sum;

        if (choice.equals("yes")) {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            matrixA = new int[rows][cols];
            matrixB = new int[rows][cols];
            sum = new int[rows][cols];

            System.out.println("Enter elements for Matrix A:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element A[" + i + "][" + j + "]: ");
                    matrixA[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements for Matrix B:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element B[" + i + "][" + j + "]: ");
                    matrixB[i][j] = scanner.nextInt();
                }
            }
        } else {
            // Example constant matrices
            rows = 2;
            cols = 2;
            matrixA = new int[][]{{1, 2}, {3, 4}};
            matrixB = new int[][]{{5, 6}, {7, 8}};
            sum = new int[rows][cols];

            System.out.println("Using constant matrices:");
            System.out.println("Matrix A:");
            printMatrix(matrixA);
            System.out.println("Matrix B:");
            printMatrix(matrixB);
        }

        // Adding the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Display the result
        System.out.println("Sum of Matrix A and Matrix B:");
        printMatrix(sum);

        scanner.close();
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
