class Counter {
	// Static variable is shared across all objects of this class
	static int objectCount = 0;
 
    Counter() {
    	// Incremented every time a new object is created
        objectCount++;
	}
 
	// Static method operates on the class-level static variable
	static void displayCount() {
        System.out.println("Total objects created: " + objectCount);
	}
}
 
public class StaticDemo {
	public static void main(String[] args) {
    	// Create three objects of Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
 
    	// Call the static method without needing an object reference
        Counter.displayCount();
	}
}
