package javaprogramme_week_4_khushbu;

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (count < 10){
            System.out.println("Enter number #" + ( count + 1) + " : ");
            if (scanner.hasNext()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                System.out.println("Invalid number . ");
                scanner.nextLine();
            }
        }
        scanner.close(); //Here scanner close within main method
        System.out.println("The sum of the numbers is : " + sum);
    }
}
