/*
package mypack;

public class ExceptionDemo extends Exception{
    public static void main(String[] args) {
        String name="Shreyanshi";
        System.out.println("Hello, " + name + ".");
        // Scenario 1: Finally block executes after try block without exceptions
        try {

        } catch (Exception e) {

        }finally{
            System.out.println("No errors. Thank you, " + name + "!");
        }
    }
}
*/

package mypack;

public class ExceptionDemo {
    public static void main(String[] args) {
        int uid=116;
        System.out.println("Hello user " + uid + ".");
        // Scenario 2: Finally block executes after try block with exceptions
        try {
            uid=uid/0;
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }finally{
            System.out.println("Exception was handled for user, " + uid + "!");
        }
    }
}
