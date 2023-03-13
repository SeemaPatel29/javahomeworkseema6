package week6homework;

import java.util.Scanner;

/**
 * Write a java program that takes three numbers as input to calculate and print
 * the average of the numbers.
 */
public class Average13 {
    static double x = 15;
    static double y = 25;
    static double z = 35;

    public static void main(String[] args) {
        numbers();
    }

    public static void numbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number :");
        x = scanner.nextDouble();
        System.out.println(" Enter Second number :");
        y = scanner.nextDouble();
        System.out.println("Enter Thrid number :");
        z = scanner.nextDouble();
        scanner.close();
        System.out.println(" The Average value is :" + (x + y+ z)/3);
    }

}
