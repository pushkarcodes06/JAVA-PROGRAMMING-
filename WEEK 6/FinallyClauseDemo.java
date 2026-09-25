import java.util.Scanner;

public class FinallyClauseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to divide 100 by: ");
        int input = scanner.nextInt();
        
        try {
            int result = 100 / input;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch Block executed: Attempted division by zero.");
        } finally {
            System.out.println("Finally Block executed: Resource cleanup or closing scanner here.");
            scanner.close();
        }
        
        System.out.println("Program finished.");
    }
}
