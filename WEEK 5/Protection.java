package p1;
public class Protection
{
   int n = 1;
   private int n_pri = 2;
   protected int n_pro = 3;
   public int n_pub = 4;
   public Protection()
   {
       System.out.println("base constructor");
       System.out.println("n = " + n);
       System.out.println("n_pri = " + n_pri);
       System.out.println("n_pro = " + n_pro);
       System.out.println("n_pub = " + n_pub);
   }
}
// Derived.java
package p1;
public class Derived extends Protection
{
   public Derived()
   {
       System.out.println("derived constructor");
       System.out.println("n = " + n);
       // System.out.println("n_pri = " + n_pri);   // private: class only
       System.out.println("n_pro = " + n_pro);
       System.out.println("n_pub = " + n_pub);
   }
}
// SamePackage.java
package p1;
public class SamePackage
{
   public SamePackage()
   {
       Protection p = new Protection();
       System.out.println("same package constructor");
       System.out.println("n = " + p.n);
       // System.out.println("n_pri = " + p.n_pri); // private: class only
       System.out.println("n_pro = " + p.n_pro);
       System.out.println("n_pub = " + p.n_pub);
   }
}
// Demo.java
package p1;
// Instantiate the various classes in p1.
public class Demo
{
   public static void main(String args[])
   {
       Protection ob1 = new Protection();
       Derived ob2 = new Derived();
       SamePackage ob3 = new SamePackage();
   }
}
