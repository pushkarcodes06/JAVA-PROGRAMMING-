class Employee {
	int empId;
	String empName;
	double salary;
 
	// Method to initialize employee details
	void setDetails(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
	}
 
	// Method to display employee details
	void showDetails() {
        System.out.println("Employee ID     : " + empId);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Employee Salary : " + salary);
	}
}
 
public class EmployeeDemo {
	public static void main(String[] args) {
    	// Create an Employee object and initialize it via a method
        Employee emp = new Employee();
        emp.setDetails(501, "Ravi Kumar", 55000.0);
 
    	// Display the initialized details
        emp.showDetails();
	}
}
