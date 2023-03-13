package week6homework;

/**
 * Write a java programme using the following steps.
 * 1.1 Declare two instance variable.
 * 1.2 Declare one instance method.
 * 1.3 call both instance variable into the instance method inside the print statment.
 * 1.4 Declare the main method.
 * 1.5 call the above instance method into the main method and run the programme.
 */
public class InstanceVariable1 {
    int s= 8;
    int r= 10;

    public static void main(String[] args) {
        InstanceVariable1 V = new InstanceVariable1();
        V.myMethod1();


        }


       public void myMethod1(){
        InstanceVariable1 V = new InstanceVariable1();
        System.out.println(V.s);
        System.out.println(V.r);
    }


}
