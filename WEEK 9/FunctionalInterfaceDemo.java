@FunctionalInterface
interface NumberCheck {
    boolean check(int number);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        NumberCheck evenCheck = (number) -> number % 2 == 0;

        int n1 = 20;
        int n2 = 15;

        System.out.println(n1 + " is even: " + evenCheck.check(n1));
        System.out.println(n2 + " is even: " + evenCheck.check(n2));
    }
}
