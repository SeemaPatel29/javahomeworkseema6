package week6homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.
 * (Formula of Area=A=PI*r*r)
 *
 */
public class AreaAndRadius6 {
    // have used scanner method to get the expected result of area of circle
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        double radius, area;
        System.out.println("Enter the radius of the circle: =");
        radius = obj.nextDouble();
        obj.close();
        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is " + area);


    }
    }
