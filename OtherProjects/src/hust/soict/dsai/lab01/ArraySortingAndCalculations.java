package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter the array (yes/no)? ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int[] array;

        if (choice.equals("yes")) {
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
        } else {
           
            array = new int[]{5, 3, 8, 1, 2, 7};
            System.out.println("Using constant array: " + Arrays.toString(array));
        }

      
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

       
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}