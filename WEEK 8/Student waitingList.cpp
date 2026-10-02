import java.util.*;

public class StudentWaitingList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Rahul");
        arrayList.add("Priya");
        arrayList.add("Arjun");

        linkedList.add("Rahul");
        linkedList.add("Priya");
        linkedList.add("Arjun");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.remove("Priya");
        linkedList.remove("Priya");

        System.out.println("ArrayList after removal: " + arrayList);
        System.out.println("LinkedList after removal: " + linkedList);
    }
}
