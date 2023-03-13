package week6homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius((F-32)x5/9=O°c).
 */
public class Temperature7 {
    static double F;
    //static double b=((F-32)* 5/9=O°);
    // I have converted 5/9= 0.555 to get accurate 0°c when you enter exact 32
       //but you can also enter any other number as well

    public static void main(String[] args) {
        temperature();

            }
            public static void temperature(){
                Scanner cel = new Scanner(System.in);
                System.out.println(" Enter Fahrenheit = ");
                F = cel.nextInt();
                cel.close();
                System.out.println("Celsius = " + ((F - 32) * .555));

            }



}
