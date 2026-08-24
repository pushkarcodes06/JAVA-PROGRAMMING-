interface Animal {
   			 public void eat(); 
}

class Dog implements Animal 
{
	public void eat()
	{
		System.out.println("Dog Eat");
	}
	
          void bark() 
           {
        System.out.println("Dog barks");
    	}
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
