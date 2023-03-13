package week6homework;

import java.util.Scanner;

/**
 * Write a java program that takes a number as input and print its multiplication table
 * up to 10
 * Test data : input a number 8
 * Expected Result:
 * 8x1=8
 * 8x2=16
 * 8x3=24
 * ......
 * 8x10=80
 *
 */
public class TimeTables10 {
    static int m;

    public static void main(String[] args) {
        multiplication();
    }

    public static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number :");
        m = scanner.nextInt();
        System.out.println(m + "* 1 =" + m * 1);
        System.out.println(m + "* 2 =" + m * 2);
        System.out.println(m + "* 3 =" + m * 3);
        System.out.println(m + "* 4 =" + m * 4);
        System.out.println(m + "* 5 =" + m * 5);
        System.out.println(m + "* 6 =" + m * 6);
        System.out.println(m + "* 7 =" + m * 7);
        System.out.println(m + "* 8 =" + m * 8);
        System.out.println(m + "* 9 =" + m * 9);
        System.out.println(m + "* 10 =" + m * 10);
        scanner.close();


    }
}
