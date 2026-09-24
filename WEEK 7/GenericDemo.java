// Generic class
class Box<T> {
    private T value;


    void setValue(T value) {
        this.value = value;
    }


    T getValue() {
        return value;
    }
}


// Generic method
class GenericDemo {


    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }


    public static void main(String[] args) {


        // Integer Box
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);


        // String Box
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java Generics");


        // Double Box
        Box<Double> doubleBox = new Box<>();
        doubleBox.setValue(25.5);


        System.out.println("Integer Value: " + intBox.getValue());
        System.out.println("String Value: " + stringBox.getValue());
        System.out.println("Double Value: " + doubleBox.getValue());


        // Calling generic method
        display(500);
        display("Hello");
        display(10.5);
    }
}
