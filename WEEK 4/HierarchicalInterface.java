
interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog makes sound");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {

    public void sound() {
        System.out.println("Cat makes sound");
    }

    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInterfaceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.bark();

        Cat c = new Cat();
        c.sound();
        c.meow();
    }
}
