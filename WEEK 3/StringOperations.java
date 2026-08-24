import java.util.Scanner;
 
public class StringOperations {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
 
   
        int length = str.length();
 
   
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
 

        String reversed = new StringBuilder(str).reverse().toString();

        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversedCleaned = new StringBuilder(cleaned).reverse().toString();
        boolean isPalindrome = cleaned.equals(reversedCleaned);
 
        System.out.println("Length      : " + length);
        System.out.println("Uppercase   : " + upper);
        System.out.println("Lowercase   : " + lower);
        System.out.println("Reversed    : " + reversed);
    	System.out.println("Palindrome? : " + isPalindrome);
 
        sc.close();
	}
}
