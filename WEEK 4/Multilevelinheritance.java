interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInterfaceDemo {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.sound();
        p.bark();
        p.weep();
    }
}
