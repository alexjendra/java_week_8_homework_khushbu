package javaprogramme_week_4_khushbu;

import java.util.Scanner;

public class Programme_4_DigitSumChallenge {

    public static int sumDigit(int number) {
        if (number >= 10) {
            int digit, sum = 0;

            while (number > 0) {
                //finds the last digit of the given number
                digit = number % 10;
                //adds last digit to the variable sum
                sum = sum + digit;
                number = number / 10;
            }
            return sum;
        } else {
            //return -1 for negative numbers And one number
            return -1;
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number = : ");
        int result = sumDigit(scanner.nextInt());
        System.out.println("Sum of number digit is : " + result);
        //closing scanner object
        scanner.close();
    }
}

