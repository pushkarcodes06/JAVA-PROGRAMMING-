import java.util.*;

public class CourseStudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Arjun");
        students.add("Sneha");

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = students.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Priya")) {
                iterator.remove();
            }
        }

        System.out.println(students);

        ListIterator<String> listIterator = students.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        listIterator = students.listIterator();

        while (listIterator.hasNext()) {
            if (listIterator.next().equals("Arjun")) {
                listIterator.set("Karan");
            }
        }

        System.out.println(students);
    }
}
