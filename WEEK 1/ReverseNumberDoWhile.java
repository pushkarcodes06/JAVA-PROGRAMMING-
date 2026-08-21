import java.util.Scanner;
 
public class ReverseNumberDoWhile {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
    	System.out.print("Enter a number: ");
    	int number = sc.nextInt();
 
    	int reverse = 0;
 
    	do {
        	int digit = number % 10;
        	reverse = reverse * 10 + digit;
        	number = number / 10;
    	} while (number != 0);
 
    	System.out.println("Reversed Number = " + reverse);
 
    	sc.close();
	}
}
