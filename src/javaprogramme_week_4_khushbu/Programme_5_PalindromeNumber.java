package javaprogramme_week_4_khushbu;

import java.util.Scanner;

public class Programme_5_PalindromeNumber {
    public static boolean isPalindrome(int number){
        //converts negative number to positive number
        if (number < 0){
            number = -number;
        }
        int lastdigit, reverse = 0, temp;
        temp = number;
        while (number > 0){
            //stores the last digit
            lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number = number / 10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = scanner.nextInt();
        boolean check = isPalindrome(a);
        //check number is palindrome or not
        if (check) {
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }
        //closing the scanner object
        scanner.close();
    }
}
