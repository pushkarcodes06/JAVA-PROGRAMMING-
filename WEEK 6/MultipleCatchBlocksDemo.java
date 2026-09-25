import java.util.Scanner;

public class MultipleCatchBlocksDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("--- Scenario Selection ---");
            System.out.println("1. Trigger Arithmetic Exception");
            System.out.println("2. Trigger Array Index Out Of Bounds Exception");
            System.out.print("Choose scenario (1 or 2): ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                int data = 50 / 0;
            } else if (choice == 2) {
                int[] arr = new int[5];
                arr[10] = 99;
            } else {
                System.out.println("Invalid selection. No exception triggered.");
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Catch Block 1: Arithmetic Exception caught! (Division by zero)");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block 2: Array Index Out Of Bounds Exception caught! (Invalid index accessed)");
        } catch (Exception e) {
            System.out.println("Catch Block 3: General Exception caught: " + e.getMessage());
        }
        
        System.out.println("Out of try-catch blocks. Program finishing smoothly.");
        scanner.close();
    }
}
