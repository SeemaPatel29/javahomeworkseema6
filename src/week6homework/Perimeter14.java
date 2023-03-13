package week6homework;

import java.text.DecimalFormat;

/**
 * Write a java program to print the area and perimeter od a rectangle.
 * Test Data: width=5.5 ,
 *            height= 8.5
 *   Expected Result:
 *   AreA = 5.6 * 8.5 = 47.60
 *   Perimeter is 2 * (5.6 + 8.5) = 28.20
 *
 */
public class Perimeter14 {
    float w = 5.6f;
    float h = 8.5f;
    static double a= 5.6 * 8.5;
    static double b =2 * (5.6 +8.5);
    public static void main(String[] args) {
        Perimeter14 obj = new Perimeter14();
        obj.area();
    }

    public void area(){
        DecimalFormat two = new DecimalFormat("00.00");
        System.out.println(" Area is 5.6 * 8.5 = " + two.format(a));
        System.out.println(" Perimeter is 2 * (5.6 +8.5) = " + two.format(b));

    }

}
