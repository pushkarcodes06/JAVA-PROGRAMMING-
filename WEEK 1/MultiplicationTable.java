import java.util.Scanner;
 
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
 
        // Print the multiplication table from 1 to 10 using a for loop
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
 
        sc.close();
    }
}

