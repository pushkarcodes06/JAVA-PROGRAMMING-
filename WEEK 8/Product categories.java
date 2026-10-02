import java.util.*;

public class ProductCategories {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Electronics");
        hashSet.add("Clothing");
        hashSet.add("Books");
        hashSet.add("Electronics");
        hashSet.add("Furniture");

        System.out.println("HashSet: " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}
