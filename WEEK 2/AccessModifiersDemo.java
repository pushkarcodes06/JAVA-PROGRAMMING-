class Person {
	public String name;   	// accessible from anywhere
    private int age;      	// accessible only within this class
    protected String city;	// accessible within the package and by subclasses
 
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
	}
 
	// Private field is exposed safely through a public getter method
	public int getAge() {
        return age;
	}
}
 
// Subclass demonstrating access to protected members
class Student extends Person {
    Student(String name, int age, String city) {
        super(name, age, city);
	}
 
	void showInheritedAccess() {
    	// 'name' (public) and 'city' (protected) are directly accessible here
        System.out.println("Accessed in subclass -> Name: " + name + ", City: " + city);
    	// 'age' (private) is NOT directly accessible; must use the getter
        System.out.println("Accessed in subclass -> Age (via getter): " + getAge());
	}
}
 
public class AccessModifiersDemo {
	public static void main(String[] args) {
  	  Student s = new Student("Meera Nair", 21, "Hyderabad");
 
    	// Public field: accessible directly from outside the class
        System.out.println("Public field 'name'	: " + s.name);
    	// Private field: NOT accessible directly, so we use the public getter
        System.out.println("Private field 'age'	: " + s.getAge());
    	// Protected field: accessible here because AccessModifiersDemo is in the same package
        System.out.println("Protected field 'city' : " + s.city);
 
  	  s.showInheritedAccess();
	}
}
