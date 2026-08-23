import java.util.Scanner;
 
public class ArrayStats {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
 
    	// Read 10 integers into the array
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
    	}
 
    	// Initialize tracking variables using the first element
        int largest = numbers[0];
        int smallest = numbers[0];
        int sum = 0;
 
    	// Traverse the array once to find largest, smallest, and sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > largest) largest = numbers[i];
            if (numbers[i] < smallest) smallest = numbers[i];
    	}
 
        double average = sum / (double) numbers.length;
 
        System.out.println("Largest  : " + largest);
        System.out.println("Smallest : " + smallest);
        System.out.println("Sum  	: " + sum);
        System.out.println("Average  : " + average);
 
        sc.close();
	}
}
 
