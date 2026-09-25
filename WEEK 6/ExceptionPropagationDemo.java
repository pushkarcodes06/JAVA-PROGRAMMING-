import java.io.IOException;

public class ExceptionPropagationDemo {

    void method3() throws IOException {
        throw new IOException("Device error/Input failure occurred in method3");
    }

    void method2() throws IOException {
        method3();
    }

    void method1() throws IOException {
        method2();
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        
        try {
            obj.method1();
        } catch (IOException e) {
            System.out.println("Exception handled in main method: " + e.getMessage());
        }
        
        System.out.println("Normal flow of execution restored.");
    }
}
