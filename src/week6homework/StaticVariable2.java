package week6homework;

/**
 * Write a java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method.
 * 2.3 call both static variable into the static method inside the pint statement.
 * 2/4 Declare the main method
 * 2.5 call the static into the main method and run the programe.
 *
 */
public class StaticVariable2 {
    // a and b are static variable
    static int a = 15;
   static int b = 25;

        public static void main(String[] args) {

            myMethod();

    }
     public static void myMethod(){
         System.out.println(a);
         System.out.println(b);

     }
}
