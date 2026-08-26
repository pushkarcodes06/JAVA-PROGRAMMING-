class Employee {
	String name; double basicSalary;
	Employee(String name, double basicSalary) {
    	this.name = name; this.basicSalary = basicSalary;
	}
	double calculateSalary() { return basicSalary; }
}
class Manager extends Employee {
	double bonus;
	Manager(String name, double basicSalary, double bonus) {
    	super(name, basicSalary);
    	this.bonus = bonus;
	}
	@Override
	double calculateSalary() { return super.calculateSalary() + bonus; }
}
class SeniorManager extends Manager {
	double carAllowance;
	SeniorManager(String name, double basicSalary, double bonus, double carAllowance) {
    	super(name, basicSalary, bonus);
    	this.carAllowance = carAllowance;
	}
	@Override
    double calculateSalary() { return super.calculateSalary() + carAllowance; }
}
public class Test {
	public static void main(String[] args) {
    	Employee e = new SeniorManager("Ravi", 50000, 10000, 5000);
    	System.out.println(e.name + "'s Salary: " + e.calculateSalary());
	}
}
