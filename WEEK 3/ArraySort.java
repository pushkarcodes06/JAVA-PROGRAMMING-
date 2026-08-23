import java.util.Scanner;
 
public class ArraySort {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
    	}
 
    	// Bubble sort: repeatedly swap adjacent elements that are out of order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                	int temp = arr[j];
                	arr[j] = arr[j + 1];
                	arr[j + 1] = temp;
                }
        	}
    	}
 
        System.out.println("Sorted array in ascending order:");
        for (int value : arr) {
            System.out.print(value + " ");
    	}
        System.out.println();
 
        sc.close();
	}
}
