class Student {
	int studentId;
	String studentName;
 
	// Method to display student details
	void display() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
	}
}
 
public class StudentDemo {
	public static void main(String[] args) {
    	// Create a Student object and set its fields
        Student s1 = new Student();
        s1.studentId = 101;
        s1.studentName = "Ananya Rao";
 
    	// Display the student's details
        s1.display();
	}
}
