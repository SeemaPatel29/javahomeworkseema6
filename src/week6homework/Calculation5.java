package week6homework;

import java.util.Scanner;

/**
 * write a program for a calculator with addition,subtraction,multiplication and division
 * methods all with parameters and use string concetenation methods
 * Note: Two static and two instance methods
 */

public class Calculation5 {
    // i have used scanner method with parameter for this calcution
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a =");
        a = scanner.nextInt();
        System.out.println("Enter value of b");
        b = scanner.nextInt();
        Calculation5 obj = new Calculation5();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
        scanner.close();

            }

    public void addition(){
        System.out.println("addition = " + (a + b));

    }
         public void subtraction(){
             System.out.println("subtraction = " + (a - b));
         }
         public static void multiplication(){
             System.out.println("multiplication = " + (a * b));
         }
         public static void division(){
             System.out.println("division = " + (a/b));
         }
        };





