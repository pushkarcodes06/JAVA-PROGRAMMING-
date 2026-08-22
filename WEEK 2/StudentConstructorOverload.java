class Student {
	int rollNo;
	String name;
 
	// Default constructor
    Student() {
        rollNo = 0;
        name = "Unknown";
	}
 
	// Parameterized constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
	}
 
	void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
	}
}
 
public class StudentConstructorOverload {
	public static void main(String[] args) {
    	// Uses the default (no-argument) constructor
        Student s1 = new Student();
 
    	// Uses the parameterized constructor
        Student s2 = new Student(102, "Karthik Reddy");
 
        System.out.print("s1 -> ");
        s1.display();
        System.out.print("s2 -> ");
        s2.display();
	}
}
