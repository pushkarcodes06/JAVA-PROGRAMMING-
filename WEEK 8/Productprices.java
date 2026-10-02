import java.util.*;

public class ProductPrices {
    public static void main(String[] args) {
        HashMap<Integer, Double> hashMap = new HashMap<>();

        hashMap.put(103, 450.0);
        hashMap.put(101, 250.0);
        hashMap.put(102, 350.0);
        hashMap.put(104, 550.0);

        int searchId = 102;

        if (hashMap.containsKey(searchId)) {
            System.out.println("Product " + searchId + ": " + hashMap.get(searchId));
        }

        hashMap.put(102, 400.0);

        TreeMap<Integer, Double> treeMap = new TreeMap<>(hashMap);

        for (Map.Entry<Integer, Double> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
