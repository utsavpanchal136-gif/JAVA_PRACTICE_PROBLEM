package CLG_PRACTICE;

import java.util.Scanner;

public class P_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase to make it case-insensitive
        ch = Character.toLowerCase(ch);

        // Check if it is alphabet
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }

        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}

