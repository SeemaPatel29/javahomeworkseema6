package week6homework;

import java.util.Scanner;

/**
 * Write a java program to swap two variables.
 *
 */
// I have taken three numbers so can swap the numbers with the help of scanner statement
public class SwapTwoVariable15 {

    int x;
    int y;
    int z;

    public static void main(String[] args) {
        SwapTwoVariable15 obj = new SwapTwoVariable15();
        obj.swap();

    }

    public void swap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x =");
        x =scanner.nextInt();
        System.out.println("Enter the value od y =");
        y = scanner.nextInt();
        int z = x;
        int x= y;
        int y= z;
        System.out.println();
        System.out.println("After swapping the value : ");
        System.out.println("value of x = " + x);
        System.out.println("value of y = " + y);
        scanner.close();


    }

}
