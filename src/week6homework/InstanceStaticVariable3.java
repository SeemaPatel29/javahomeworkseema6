package week6homework;

/**
 * Write a java programme using the following steps.
 * 3.1 Declare one instance and one static variable
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 call both instance and static variables into both instance and static method inside the
       print statement.
 * 3.5 Declarer the main method.
 * 3.6 call both instance and static methods into the main method and run the programme.
  */



public class InstanceStaticVariable3 {
     int a =10;
     static int b= 20;
    // b is static variable and a is instance variable
    public static void main(String[] args) {
       InstanceStaticVariable3 obj= new InstanceStaticVariable3();
       obj.myMethod();
        myMethod2();

        }

    public void myMethod(){
        InstanceStaticVariable3 obj = new InstanceStaticVariable3();
        System.out.println(a);


    }

    public static void myMethod2(){
        //InstanceVariable1 obj = new InstanceVariable1();
        System.out.println(b);

    }


    }
