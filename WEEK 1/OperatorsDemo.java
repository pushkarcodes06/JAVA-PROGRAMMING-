import java.util.Scanner;
 
public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Read two integers from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
 
        // ---------- Arithmetic Operators ----------
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
 
        // ---------- Relational Operators ----------
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
 
        // ---------- Logical Operators ----------
        System.out.println("\n--- Logical Operators ---");
        boolean cond1 = (a > 0);
        boolean cond2 = (b > 0);
        System.out.println("cond1 && cond2 : " + (cond1 && cond2));
        System.out.println("cond1 || cond2 : " + (cond1 || cond2));
        System.out.println("!cond1         : " + (!cond1));
 
        // ---------- Assignment Operators ----------
        System.out.println("\n--- Assignment Operators ---");
        int c = a;
        System.out.println("c = a   -> " + c);
        c += b; System.out.println("c += b  -> " + c);
        c -= b; System.out.println("c -= b  -> " + c);
        c *= b; System.out.println("c *= b  -> " + c);
        c /= (b == 0 ? 1 : b); System.out.println("c /= b  -> " + c);
 
        // ---------- Unary Operators ----------
        System.out.println("\n--- Unary Operators ---");
        System.out.println("+a  : " + (+a));
        System.out.println("-a  : " + (-a));
        System.out.println("++a : " + (++a));
        System.out.println("--a : " + (--a));
 
        sc.close();
    }
}
