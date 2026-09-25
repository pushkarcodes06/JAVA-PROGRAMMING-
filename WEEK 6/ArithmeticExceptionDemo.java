import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();
        
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error Caught: Cannot divide an integer by zero!");
        }
        
        System.out.println("Program execution continues successfully after the try-catch block.");
        scanner.close();
    }
}
