class Animal {
    int x = 100;
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    int x = 200;
    void display() {
        System.out.println("Parent x = " + super.x);
        System.out.println("Child x = " + x);
        super.sound();
        sound();
    }

    void sound() {
        System.out.println("Dog barks");
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
