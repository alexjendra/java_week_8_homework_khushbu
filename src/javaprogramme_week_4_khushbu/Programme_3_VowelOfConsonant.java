package javaprogramme_week_4_khushbu;

import java.util.Scanner;

public class Programme_3_VowelOfConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet : ");
        char inputChar = scanner.next().charAt(0);

        if (!Character.isLetter(inputChar)){
            System.out.println("Error : Invalid input. Please enter a single letter alphabet.");
            return;
        }
        if (inputChar >= 'a' && inputChar <= 'z'){
            inputChar = Character.toLowerCase(inputChar);
        }
        if (inputChar == 'a'|| inputChar == 'e'|| inputChar == 'i' ||inputChar == 'u'){
            System.out.println("Input letter is Vowel, for java");
        }else {
            System.out.println("Input letter is Consonant, for java");
        }
    }
}
