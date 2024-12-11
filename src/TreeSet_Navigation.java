import java.util.TreeSet;

public class TreeSet_Navigation {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        int first = numbers.first();
        System.out.println("First Number: " + first);
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }
}
