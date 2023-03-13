package week6homework;

import java.util.Scanner;

/**
 * Write a program to convert the uppercase to lower case.
 *
 */
// i have used new method toLowerCase to convert uppercase into lowercase

public class UpperLower9 {
    public static void main(String[] args) {
        uptolow();
    }
    public static void uptolow(){
        System.out.print("Write your statement: ");
        Scanner scanner = new Scanner(System.in);
        String S1= new String();
        S1 = scanner.nextLine();
        System.out.println(S1.toLowerCase());
        scanner.close();

    }

}
