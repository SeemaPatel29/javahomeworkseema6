package week6homework;

import java.util.Scanner;

/**
 * write a program to calculate the area of triangle
 */
public class Triangle8 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    double h;
    double w;
    double area;
    System.out.println("Enter height = " );
      h = scanner.nextDouble();

    System.out.print("Enter width =");
    w = scanner.nextDouble();
    area = (h * w/2);
    System.out.println("Area of triangle is " + area);

  scanner.close();

    }
}




