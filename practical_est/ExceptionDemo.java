package practical_est;

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
