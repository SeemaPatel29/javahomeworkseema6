package week6homework;

/**
 * Write a java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the main methods.
 * 4.6 call both instance and static methods into the main methods and run the programme.
 */
public class InstanceStatic4 {
    // i have used instance as String and int as static
         String name = "Sima";
     String surname = "Patel";
    static  int c = 25;
     static  int d =20;

    public static void main(String[] args) {
        InstanceStatic4 m = new InstanceStatic4();
        m.myName();
        myAge();

    }
   public void myName(){
       System.out.println(name);
       System.out.println(surname);


   }
   public static void myAge(){
       System.out.println(c);
       System.out.println(d);

   }

}
