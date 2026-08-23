import java.util.Scanner;
 
public class CircleFinal {
	// 'final' variable: its value cannot be changed once assigned
	static final double PI = 3.14159;
 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
 
    	// Calculate area and circumference using the final PI constant
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
 
        System.out.println("Area of circle      	: " + area);
        System.out.println("Circumference of circle  : " + circumference);
 
        sc.close();
	}
}
 
