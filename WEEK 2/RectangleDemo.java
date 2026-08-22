 class Rectangle {
	double length;
	double breadth;
 
	// Parameterized constructor initializes length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
	}
 
	// Method to calculate and return the area
	double area() {
 	   return length * breadth;
	}
}
 
public class RectangleDemo {
	public static void main(String[] args) {
    	// Object is created and initialized in a single step via the constructor
        Rectangle rect = new Rectangle(12.5, 6.0);
 
    	System.out.println("Length : " + rect.length);
        System.out.println("Breadth: " + rect.breadth);
        System.out.println("Area   : " + rect.area());
	}
}
