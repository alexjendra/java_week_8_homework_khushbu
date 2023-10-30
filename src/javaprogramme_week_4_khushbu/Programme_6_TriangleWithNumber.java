package javaprogramme_week_4_khushbu;

import java.util.Scanner;

public class Programme_6_TriangleWithNumber {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows from the console.
        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();

        // Print the pattern.
        printPattern(numberOfRows);
    }

    public static void printPattern(int numberOfRows) {
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
