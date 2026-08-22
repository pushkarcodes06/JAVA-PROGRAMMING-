class Calculator {
	// Overload 1: adds two integers
	int add(int a, int b) {
    	return a + b;
	}
 
	// Overload 2: adds three integers
	int add(int a, int b, int c) {
        return a + b + c;
	}
 
	// Overload 3: adds two double values
	double add(double a, double b) {
        return a + b;
	}
}
 
public class OverloadDemo {
	public static void main(String[] args) {
        Calculator calc = new Calculator();
 
    	// The compiler picks the correct overload based on argument count/types
        System.out.println("add(2, 3)     	= " + calc.add(2, 3));
        System.out.println("add(2, 3, 4)  	= " + calc.add(2, 3, 4));
        System.out.println("add(2.5, 3.5) 	= " + calc.add(2.5, 3.5));
	}
}
